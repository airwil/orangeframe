package com.orangeframe.common.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

/**
 * 文件工具类
 * @author ever
 *
 */
public class FileUtils {
	/**
	 * 文件上传
	 * @param bytes
	 * @param originalFileName
	 * @param fileDirPath
	 * @return
	 * @throws IOException
	 */
	public static String upload(byte[] bytes, String originalFileName, String fileDirPath) throws IOException {
		File fileDir = new File(fileDirPath);
		if (!fileDir.exists()) {
			fileDir.mkdirs();
		}
		// 文件类型
		String fileType = originalFileName.substring(originalFileName.lastIndexOf(".") + 1);
		String uuid = UUID.randomUUID().toString();
		String fileName = uuid + "." + fileType;

		Path path = Paths.get(fileDirPath, fileName);
		Files.write(path, bytes);
		return fileName;
	}
}
