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
import nth.reflect.fw.layer5provider.reflection.behavior.hidden.Hidden;

/**
 * {@link DomainObject} class to test all the supported
 * {@link DomainObjectProperty} types where all properties are hidden
 * (visible=false)
 * 
 * @author nilsth
 *
 */
public class TestWithHiddenProperties extends Test {

	public boolean isMyBooleanVisible() {
		return false;
	}

	@Override
	@Hidden
	public byte getMyByte() {
		return super.getMyByte();
	}

	@Override
	@Hidden
	public short getMyShort() {
		return super.getMyShort();
	}

	@Override
	@Hidden
	public int getMyInt() {
		return super.getMyInt();
	}

	@Override
	@Hidden
	public long getMyLong() {
		return super.getMyLong();
	}

	@Override
	@Hidden
	public float getMyFloat() {
		return super.getMyFloat();
	}

	@Hidden
	@Override
	public double getMyDouble() {
		return super.getMyDouble();
	}

	@Hidden
	@Override
	public char getMyChar() {
		return super.getMyChar();
	}

	@Hidden
	@Override
	public String getMyText() {
		return super.getMyText();
	}

	@Hidden
	@Override
	public String getMyTextArea() {
		return super.getMyTextArea();
	}

	@Hidden
	@Override
	public String getMyPassWord() {
		return super.getMyPassWord();
	}

	@Override
	@Hidden
	public Date getMyDate() {
		return super.getMyDate();
	}

	@Hidden
	@Override
	public Date getMyTime() {
		return super.getMyTime();
	}

	@Hidden
	@Override
	public Date getMyDateTime() {
		return super.getMyDateTime();
	}

	@Hidden
	@Override
	public PickOrder getMyEnum() {
		return super.getMyEnum();
	}

	@Hidden
	@Override
	public Calendar getMyCalendar() {
		return super.getMyCalendar();
	}

	@Hidden
	@Override
	public AtomicInteger getMyAtomicInteger() {
		return super.getMyAtomicInteger();
	}

	@Hidden
	@Override
	public AtomicLong getMyAttomicLong() {
		return super.getMyAttomicLong();
	}

	@Hidden
	@Override
	public BigDecimal getMyBigDecimal() {
		return super.getMyBigDecimal();
	}

	@Hidden
	@Override
	public BigInteger getMyBigInteger() {
		return super.getMyBigInteger();
	}

	@Hidden
	@Override
	public LocalDate getMyLocalDate() {
		return super.getMyLocalDate();
	}

	@Hidden
	@Override
	public LocalTime getMyLocalTime() {
		return super.getMyLocalTime();
	}

	@Hidden
	@Override
	public LocalDateTime getMyLocalDateTime() {
		return super.getMyLocalDateTime();
	}

}