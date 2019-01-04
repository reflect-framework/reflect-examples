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
public class TestWithDisabledProperties extends Test {

	@Order(sequenceNumber = 1)
	@Override
	public boolean isMyBoolean() {
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
	public byte getMyByte() {
		return super.getMyByte();
	}

	@Override
	@Disabled
	public short getMyShort() {
		return super.getMyShort();
	}

	@Override
	@Disabled
	public int getMyInt() {
		return super.getMyInt();
	}

	@Override
	@Disabled
	public long getMyLong() {
		return super.getMyLong();
	}

	@Override
	@Disabled
	public float getMyFloat() {
		return super.getMyFloat();
	}

	@Disabled
	@Override
	public double getMyDouble() {
		return super.getMyDouble();
	}

	@Disabled
	@Override
	public char getMyChar() {
		return super.getMyChar();
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
	public Date getMyTime() {
		return super.getMyTime();
	}

	@Disabled
	@Override
	public Date getMyDateTime() {
		return super.getMyDateTime();
	}

	@Disabled
	@Override
	public PickOrder getMyEnum() {
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
