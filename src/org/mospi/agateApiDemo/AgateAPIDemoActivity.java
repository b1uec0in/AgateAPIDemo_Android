package org.mospi.agateApiDemo;

import org.mospi.moml.framework.pub.core.MOMLActivity;
import org.mospi.moml.webkit.pub.core.MOMLWebKit;

import android.os.Bundle;

public class AgateAPIDemoActivity extends MOMLActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		MOMLWebKit.init(getMomlView());

		this.loadApplication("moml/applicationInfo.xml");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		System.exit(0);
	}

}