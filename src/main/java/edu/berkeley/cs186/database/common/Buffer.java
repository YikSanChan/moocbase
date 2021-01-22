package edu.berkeley.cs186.database.common;

public interface Buffer {
  Buffer get(byte[] dst, int offset, int length);

  byte get(int index);

  byte get();

  Buffer get(byte[] dst);

  char getChar();

  char getChar(int index);

  double getDouble();

  double getDouble(int index);

  float getFloat();

  float getFloat(int index);

  int getInt();

  int getInt(int index);

  long getLong();

  long getLong(int index);

  short getShort();

  short getShort(int index);

  Buffer put(byte[] src, int offset, int length);

  Buffer put(byte[] src);

  Buffer put(byte b);

  Buffer put(int index, byte b);

  Buffer putChar(char value);

  Buffer putChar(int index, char value);

  Buffer putDouble(double value);

  Buffer putDouble(int index, double value);

  Buffer putFloat(float value);

  Buffer putFloat(int index, float value);

  Buffer putInt(int value);

  Buffer putInt(int index, int value);

  Buffer putLong(long value);

  Buffer putLong(int index, long value);

  Buffer putShort(short value);

  Buffer putShort(int index, short value);

  Buffer slice();

  Buffer duplicate();

  int position();

  Buffer position(int pos);
}
