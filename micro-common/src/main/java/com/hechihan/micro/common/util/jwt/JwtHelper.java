/**
 * @author: cloudy  Date: 2018/1/30 Time: 16:24
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.common.util.jwt;

import com.hechihan.micro.common.constants.CommonConstants;
import com.hechihan.micro.common.util.KeyHelper;
import com.hechihan.micro.common.util.StringHelper;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;

@Slf4j
public class JwtHelper {

    /**
     * 加密token
     * @param jwtInfo
     * @param expireTime
     * @return
     * @throws Exception
     */
    public static String generateToken(JwtInfo jwtInfo, String priKeyPath, int expireTime) throws Exception{
        String compactJws = Jwts.builder()
                .setSubject(jwtInfo.getUsername())
                .claim(CommonConstants.JWT_KEY_USER_ID,jwtInfo.getUserId())
                .claim(CommonConstants.JWT_KEY_NAME,jwtInfo.getName())
                .setExpiration(DateTime.now().plusSeconds(expireTime).toDate())
                .signWith(SignatureAlgorithm.RS256, KeyHelper.getPrivateKey(priKeyPath))
                .compact();
        return compactJws;
    }

    /**
     * 公钥解析token
     * @param token
     * @param pubKeyPath
     * @return
     * @throws Exception
     */
    public static Jws<Claims> parserToken(String  token,String pubKeyPath) throws Exception{
        Jws<Claims> claimsJwts = Jwts.parser().setSigningKey(KeyHelper.getPublicKey(pubKeyPath)).parseClaimsJws(token);
        return claimsJwts;

    }

    /**
     * 获取用户信息
     * @param token
     * @param pubKeyPath
     * @return
     */
    public static JwtInfo getInfoFromToken(String token, String pubKeyPath) throws Exception {
        Jws<Claims> claimsJws = parserToken(token,pubKeyPath);
        Claims body = claimsJws.getBody();
        return new JwtInfo(body.getSubject(),
                StringHelper.getObjectValue(body.get(CommonConstants.JWT_KEY_USER_ID)),
                StringHelper.getObjectValue(body.get(CommonConstants.JWT_KEY_NAME)));
    }


}
