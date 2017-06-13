package blog.util;

/**
 * Created by yiming on 2017/6/9.
 */

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * MD5 加密工具类
 */
public class CryptographyUtil {

    /**
     * 使用Shiro中的md5加密 (加盐)
     */
    public static String md5(String str,String salt) {
        return new Md5Hash(str, salt).toString();
    }
}
