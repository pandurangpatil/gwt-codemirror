/*******************************************************************************
 * MIT License (MIT) © 2014 Copyright Agnie Media Software Pvt. Ltd.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 ******************************************************************************/
package com.agnie.gwt.codemirror.test.client;

import com.agnie.gwt.codemirror.client.OnFocusEvent;
import com.agnie.gwt.codemirror.client.OnFocusHandler;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * @author Pandurang Patil 11-Sep-2014
 *
 */
public class CodeMirrorTest implements EntryPoint {
	EditorTest	test		= new EditorTest();
	Button		btnGetValue	= new Button("Get Value");
	Button		btnRepaint	= new Button("Repaint");

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.google.gwt.core.client.EntryPoint#onModuleLoad()
	 */
	@Override
	public void onModuleLoad() {
		btnGetValue.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				Window.alert(test.getValue());
			}
		});
		btnRepaint.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				RootPanel.get().clear();
				init();
			}
		});
		test.addFocusHandler(new OnFocusHandler() {

			@Override
			public void onFocus(OnFocusEvent event) {
				RootPanel.get().add(new Label("On focus event fired..."));
			}
		});
		init();
	}

	private void init() {
		RootPanel.get().add(test);
		RootPanel.get().add(btnGetValue);
		RootPanel.get().add(btnRepaint);
	}

}
