package nth.reflect.all.feature.domain;

import nth.reflect.fw.infrastructure.random.Random;
import nth.reflect.fw.infrastructure.random.RandomGenerator;

public class TestRandomGenerator extends RandomGenerator<Test> {

	@Override
	public Test generate() {
		Test test = new Test();
		test.setMyBoolean(Random.bool().generate());
		test.setMyByte(Random.byte_().generate());
		test.setMyChar(Random.character().generate());
		test.setMyDouble(Random.double_().generate());
		test.setMyFloat(Random.float_().generate());
		test.setMyInt(Random.integer().generate());
		test.setMyLong(Random.long_().generate());
		test.setMyShort(Random.short_().generate());
		test.setMyText(Random.sentence().generate());
		test.setMyTextArea(Random.chapter().generate());
		test.setMyPassWord(Random.word().generate());
		test.setMyDate(Random.date().generate());
		test.setMyTime(Random.date().generate());
		test.setMyDateTime(Random.date().generate());
		test.setMyCalendar(Random.calendar().generate());
		test.setMyLocalDate(Random.localDate().generate());
		test.setMyLocalTime(Random.localTime().generate());
		test.setMyLocalDateTime(Random.localDateTime().generate());
		return test;
	}

}
