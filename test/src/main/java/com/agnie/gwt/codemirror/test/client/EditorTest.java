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

import com.agnie.gwt.codemirror.client.CodeMirror;
import com.agnie.gwt.codemirror.client.OnFocusHandler;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author Pandurang Patil 11-Sep-2014
 *
 */
public class EditorTest extends Composite {

	private static EditorTestUiBinder	uiBinder	= GWT.create(EditorTestUiBinder.class);

	interface EditorTestUiBinder extends UiBinder<Widget, EditorTest> {
	}

	@UiField
	CodeMirror	editor;

	public EditorTest() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public void addFocusHandler(OnFocusHandler handler) {
		editor.addFocusHandler(handler);
	}

	public String getValue() {
		return editor.getEditor().getDocument().getValue();
	}

	public CodeMirror getCodeMirror() {
		return editor;
	}

	public void setValue(String value) {
		editor.getEditor().getDocument().setValue(value);
	}

}
