package com.bigdata.core;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.FileCopyUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class JsonUtils {

    public static JSONObject loadFile(String fileName) {

        JSONObject jsonObject = null;
        // JSON 파일 읽기
        Resource resource = new ClassPathResource(fileName);

        InputStream inputStream = null;
        String data = "";
        try {
            inputStream = resource.getInputStream();
            byte[] bdata = FileCopyUtils.copyToByteArray(inputStream);
            data = new String(bdata, StandardCharsets.UTF_8);

            JSONParser jsonParser = new JSONParser();
            jsonObject = (JSONObject) jsonParser.parse(data);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return jsonObject;
    }

}
