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
public class DomainObjectWithHiddenProperties extends DomainObject {

	public boolean isMyBooleanVisible() {
		return false;
	}

	@Override
	@Hidden
	public byte getMySimpleByte() {
		return super.getMySimpleByte();
	}

	@Override
	@Hidden
	public short getMySimpleShort() {
		return super.getMySimpleShort();
	}

	@Override
	@Hidden
	public int getMySimpleInt() {
		return super.getMySimpleInt();
	}

	@Override
	@Hidden
	public long getMySimpleLong() {
		return super.getMySimpleLong();
	}

	@Override
	@Hidden
	public float getMySimpleFloat() {
		return super.getMySimpleFloat();
	}

	@Hidden
	@Override
	public double getMySimpleDouble() {
		return super.getMySimpleDouble();
	}

	@Hidden
	@Override
	public char getMySimpleChar() {
		return super.getMySimpleChar();
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
	public Date getMyDateWithTimeFormat() {
		return super.getMyDateWithTimeFormat();
	}

	@Hidden
	@Override
	public Date getMyDateWithDateTimeFormat() {
		return super.getMyDateWithDateTimeFormat();
	}

	@Hidden
	@Override
	public MyEnum getMyEnum() {
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
