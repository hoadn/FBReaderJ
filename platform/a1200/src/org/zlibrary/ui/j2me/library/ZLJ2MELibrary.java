package org.zlibrary.ui.j2me.library;

import java.io.InputStream;

//import android.content.Resources;
//import android.content.Intent;
//import android.net.ContentURI;

import org.zlibrary.core.library.ZLibrary;
import org.zlibrary.core.view.ZLPaintContext;
//import org.zlibrary.core.application.ZLApplication;

//import org.zlibrary.core.xml.sax.ZLSaxXMLProcessorFactory;
import org.zlibrary.core.xml.own.ZLOwnXMLProcessorFactory;
//import org.zlibrary.ui.android.sqliteconfig.ZLSQLiteConfigManager;

//import org.zlibrary.ui.android.view.ZLAndroidPaintContext;
//import org.zlibrary.ui.android.view.ZLAndroidWidget;
//import org.zlibrary.ui.android.application.ZLAndroidApplicationWindow;
//import org.zlibrary.ui.android.image.ZLAndroidImageManager;

final class ZLJ2MELibrary extends ZLibrary {
	public ZLPaintContext createPaintContext() {
		// TODO: implement
		return null;
	}

	public InputStream getResourceInputStream(String fileName) {
		return getClass().getResourceAsStream(fileName);
	}

/*
	public static void shutdown() {
		ZLSQLiteConfigManager.release();
	}

	public void finish() {
		shutdown();
		if (myActivity != null) {
			myActivity.finish();
		}
	}
*/

	public void openInBrowser(String reference) {
		// TODO: implement
	}

	void run() {
		new ZLOwnXMLProcessorFactory();
		//new ZLSQLiteConfigManager();
		//loadProperties();
		/*
		new ZLAndroidImageManager();

		try {
			ZLApplication application = (ZLApplication)getApplicationClass().newInstance();
			myMainWindow = new ZLAndroidApplicationWindow(application);
			application.initWindow();
		} catch (Exception e) {
			finish();
		}
		*/
	}
}
