package com.example.han.lab4_3;

import android.provider.BaseColumns;

public final class UserContract {
	public UserContract(){}
	
	public static abstract class User implements BaseColumns{
		public static final String TABLE_NAME ="user";
		public static final String COLUMN_NAME ="name";
		public static final String COLUMN_EMAIL ="email";
	}
}
