package com.example.climbxpert;

import android.content.Context;
import android.widget.Toast;

public class LoggerTools {

	public static void LogToast(Context context, CharSequence message)
	{
		Toast.makeText(context, message, Toast.LENGTH_LONG).show();
	}
	
	//TODO: add more log tools
}
