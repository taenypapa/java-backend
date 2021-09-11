package com.bigdata;

import com.bigdata.center.Center;
import com.bigdata.center.CenterRepository;
import com.bigdata.index.Index;
import com.bigdata.index.IndexRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Slf4j
public class DataInitializer implements ApplicationRunner {

	@Autowired
	IndexRepository indexRepository;

	@Autowired
	CenterRepository centerRepository;

	@Override
	public void run(ApplicationArguments args) {
		indexRepository.save(Index.builder()
				.name("test1")
				.enrollmentDate(LocalDateTime.now())
				.build());

		indexRepository.save(Index.builder()
				.name("test2")
				.enrollmentDate(LocalDateTime.now())
				.build());


		centerRepository.save(Center.builder()
				.name("진천블라썸센터")
				.type("물류센터")
				.address("충북 진천군 진천읍 씨제이로 110")
				.description("CJ 제조 자동화 Main 센터")
				.lat("36.8783221975719")
				.lng("127.460777580852")
				.build()
		);

		centerRepository.save(Center.builder()
				.name("하양 SMART SUB")
				.type("물류센터")
				.address("경북 경산시 하양읍 대학리 산116")
				.description("경북권 3온도 통합‧공동‧자동화 센터")
				.lat("35.9409831")
				.lng("128.8203359")
				.build()
		);



	}
}