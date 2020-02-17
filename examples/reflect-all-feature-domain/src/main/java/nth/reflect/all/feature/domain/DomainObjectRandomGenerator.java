package nth.reflect.all.feature.domain;

import nth.reflect.fw.infrastructure.random.Random;
import nth.reflect.fw.infrastructure.random.RandomGenerator;
import nth.reflect.fw.layer3domain.DomainObject;
import nth.reflect.fw.layer3domain.DomainObject.MyEnum;

public class DomainObjectRandomGenerator extends RandomGenerator<DomainObject> {

	@Override
	public DomainObject generate() {
		DomainObject domainObject = new DomainObject();
		domainObject.setMySimpleBoolean(Random.bool().generate());
		domainObject.setMyBoolean(Random.bool().generate());

		domainObject.setMySimpleByte(Random.byte_().generate());
		domainObject.setMyByte(Random.byte_().generate());

		domainObject.setMySimpleChar(Random.character().generate());
		domainObject.setMyCharacter(Random.character().generate());

		domainObject.setMySimpleDouble(Random.double_().generate());
		domainObject.setMyDouble(Random.double_().generate());

		domainObject.setMySimpleFloat(Random.float_().generate());
		domainObject.setMyFloat(Random.float_().generate());

		domainObject.setMySimpleInt(Random.integer().generate());
		domainObject.setMyInteger(Random.integer().generate());

		domainObject.setMySimpleLong(Random.long_().generate());
		domainObject.setMyLong(Random.long_().generate());

		domainObject.setMySimpleShort(Random.short_().generate());
		domainObject.setMyShort(Random.short_().generate());

		domainObject.setMyText(Random.sentence().generate());
		domainObject.setMyTextArea(Random.chapter().generate());
		domainObject.setMyPassWord(Random.word().generate());

		domainObject.setMyLocalDate(Random.localDate().generate());
		domainObject.setMyLocalTime(Random.localTime().generate());
		domainObject.setMyLocalDateTime(Random.localDateTime().generate());

		domainObject.setMyDate(Random.date().generate());
		domainObject.setMyDateWithDateFormat(Random.date().generate());
		domainObject.setMyDateWithTimeFormat(Random.date().generate());
		domainObject.setMyDateWithDateTimeFormat(Random.date().generate());
		domainObject.setMyDateWithDateAnnotation(Random.date().generate());
		domainObject.setMyDateWithTimeAnnotation(Random.date().generate());
		domainObject.setMyDateWithDateTimeAnnotation(Random.date().generate());

		domainObject.setMyCalendar(Random.calendar().generate());
		domainObject.setMyCalendarWithTimeFormat(Random.calendar().generate());
		domainObject.setMyCalendarWithDateTimeFormat(Random.calendar().generate());
		domainObject.setMyCalendar(Random.calendar().generate());
		domainObject.setMyCalendarWithDateAnnotation(Random.calendar().generate());
		domainObject.setMyCalendarWithTimeAnnotation(Random.calendar().generate());
		domainObject.setMyCalendarWithDateTimeAnnotation(Random.calendar().generate());

		domainObject.setMyEnum((MyEnum) Random.fromEnum(DomainObject.MyEnum.class).generate());

		//TODO domainObject.setMyAtomicInteger(Random.in) {
		//TODO domainObject.setMyAttomicLong(AtomicLong myAttomicLong) {

		domainObject.setMyBigDecimal(Random.bigDecimal().generate());
		domainObject.setMyBigInteger(Random.bigInteger().generate());

		return domainObject;
	}

}
