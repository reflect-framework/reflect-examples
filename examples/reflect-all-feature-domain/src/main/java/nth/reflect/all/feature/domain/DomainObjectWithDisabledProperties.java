package nth.reflect.all.feature.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import nth.reflect.fw.layer3domain.DomainObject;
import nth.reflect.fw.layer3domain.DomainObjectProperty;
import nth.reflect.fw.layer5provider.reflection.behavior.disabled.Disabled;
import nth.reflect.fw.layer5provider.reflection.behavior.order.Order;

/**
 * {@link DomainObject} class to test all the supported
 * {@link DomainObjectProperty} types where all properties are hidden
 * (visible=false)
 * 
 * @author nilsth
 *
 */
public class DomainObjectWithDisabledProperties extends DomainObject {

	@Order(value = 1)
	@Override
	public boolean isMySimpleBoolean() {
		return super.isMyBoolean();
		/*
		 * TODO: BehavioralMethods have the following issue: When a getterMethod
		 * is in a super class and the BehavioralMethod is in a subclass it wont
		 * find the BehavioralMethod because the findFor(Method method) will use
		 * the declaringClass of the method to find the BehavioralMethod. This
		 * can be solved by overriding the getterMethod in the subclass but this
		 * is not so obvious. Better solution would be if pass the ownerClass as
		 * a parameter.
		 */
	}

	public boolean myBooleanDisabled() {
		return true;
	}

	@Override
	@Disabled
	public byte getMySimpleByte() {
		return super.getMySimpleByte();
	}

	@Override
	@Disabled
	public short getMySimpleShort() {
		return super.getMySimpleShort();
	}

	@Override
	@Disabled
	public int getMySimpleInt() {
		return super.getMySimpleInt();
	}

	@Override
	@Disabled
	public long getMySimpleLong() {
		return super.getMySimpleLong();
	}

	@Override
	@Disabled
	public float getMySimpleFloat() {
		return super.getMySimpleFloat();
	}

	@Disabled
	@Override
	public double getMySimpleDouble() {
		return super.getMySimpleDouble();
	}

	@Disabled
	@Override
	public char getMySimpleChar() {
		return super.getMySimpleChar();
	}

	@Disabled
	@Override
	public String getMyText() {
		return super.getMyText();
	}

	@Disabled
	@Override
	public String getMyTextArea() {
		return super.getMyTextArea();
	}

	@Disabled
	@Override
	public String getMyPassWord() {
		return super.getMyPassWord();
	}

	@Override
	@Disabled
	public Date getMyDate() {
		return super.getMyDate();
	}

	@Disabled
	@Override
	public Date getMyDateWithDateFormat() {
		return super.getMyDateWithTimeFormat();
	}

	@Disabled
	@Override
	public Date getMyDateWithDateTimeFormat() {
		return super.getMyDateWithDateTimeFormat();
	}

	@Disabled
	@Override
	public MyEnum getMyEnum() {
		return super.getMyEnum();
	}

	@Disabled
	@Override
	public Calendar getMyCalendar() {
		return super.getMyCalendar();
	}

	@Disabled
	@Override
	public AtomicInteger getMyAtomicInteger() {
		return super.getMyAtomicInteger();
	}

	@Disabled
	@Override
	public AtomicLong getMyAttomicLong() {
		return super.getMyAttomicLong();
	}

	@Disabled
	@Override
	public BigDecimal getMyBigDecimal() {
		return super.getMyBigDecimal();
	}

	@Disabled
	@Override
	public BigInteger getMyBigInteger() {
		return super.getMyBigInteger();
	}

	@Disabled
	@Override
	public LocalDate getMyLocalDate() {
		return super.getMyLocalDate();
	}

	@Disabled
	@Override
	public LocalTime getMyLocalTime() {
		return super.getMyLocalTime();
	}

	@Disabled
	@Override
	public LocalDateTime getMyLocalDateTime() {
		return super.getMyLocalDateTime();
	}

}
