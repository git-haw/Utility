package top.haw358.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 2017-01-04
 * @author <a href="mailto:haw358linux@163.com">黄爱伟</a>
 *
 */
public class ExtensionUtil {
	private static final Map<String, String> EXT = new HashMap<String, String>();
	static {
		EXT.put("image/jpeg", ".jpg");
		EXT.put("audio/mpeg", ".mp3");
		EXT.put("audio/amr", ".amr");
		EXT.put("video/mp4", ".mp4");
		EXT.put("video/mpeg4", ".mp4");
	}

	/**
	 * 根据内容类型判断文件扩展名
	 * @param contentType
	 * @return
	 */
	public static String getFileExpandedName(String contentType) {
		return EXT.get(contentType);
	}
}
