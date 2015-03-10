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
package com.agnie.gwt.codemirror.client;

import com.agnie.gwt.codemirror.addon.resources.Cursor;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.TextAreaElement;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.HandlerRegistration;

/**
 * @author Pandurang Patil 11-Sep-2014
 *
 */
public class CodeMirror extends Composite {

	interface MyUiBinder extends UiBinder<Widget, CodeMirror> {
	}

	private static MyUiBinder	uiBinder		= GWT.create(MyUiBinder.class);

	// Text area
	@UiField
	TextAreaElement				txtarea;

	HTMLPanel					container;
	String						height;
	String						width;
	private SimpleEventBus		privateEventBus	= new SimpleEventBus();
	// Unique text area id generated for this editor
	private final String		editorId;
	private Editor				editor;
	private Configuration		config			= (Configuration) Configuration.createObject();

	public CodeMirror() {
		this.editorId = "code-mirror-" + System.currentTimeMillis();
		container = (HTMLPanel) uiBinder.createAndBindUi(this);
		initWidget(container);
		txtarea.setId(editorId);
	}

	public void setMode(CMMode mode) {
		config.setMode(mode.getMode());
	}

	public void setTheme(Theme theme) {
		config.setTheme(theme.getTheme());
	}

	public void setKeyMap(KeyMap keyMap) {
		config.setKeyMap(keyMap.getKey());
	}

	public void setLineNumbers(boolean flag) {
		config.setLineNumbers(flag);
	}

	public void setAutoCloseBrackets(boolean autoCloseBrackets) {
		config.setAutoCloseBrackets(autoCloseBrackets);
	}

	public void setAutoCloseTags(boolean autoCloseTags) {
		config.setAutoCloseTags(autoCloseTags);
	}

	public void setMatchBrackets(boolean matchBrackets) {
		config.setMatchBrackets(matchBrackets);
	}

	public void setMatchTags(boolean matchTags) {
		config.setMatchTags(matchTags);
	}

	/**
	 * Add focus handler
	 * 
	 * @param handler
	 * @return
	 */
	public HandlerRegistration addFocusHandler(OnFocusHandler handler) {
		return privateEventBus.addHandler(OnFocusEvent.TYPE, handler);
	}

	void onFocus(JavaScriptObject editor) {
		Editor ed = (Editor) editor;
		privateEventBus.fireEvent(new OnFocusEvent(ed));
	}

	public HandlerRegistration addBlurHandler(OnBlurHandler handler) {
		return privateEventBus.addHandler(OnBlurEvent.TYPE, handler);
	}

	void onBlur() {
		privateEventBus.fireEvent(new OnBlurEvent(editor));
	}
	
	void setReadOnlyMode(boolean state){
		config.setReadOnly(state);
	}

	@Override
	protected void onLoad() {
		super.onLoad();
		GWT.log("Editor is being formed.");
		if (editor == null) {
			editor = Editor.fromTextArea(txtarea, config, this);
		}
		editor.setSize(width, height);
		editor.refresh();
	}

	@Override
	protected void onUnload() {
		super.onUnload();
	}

	public Editor getEditor() {
		return editor;
	}

	/**
	 * @param height
	 *            height in pixel or percentage e.g. for 100px - "100" for 100% - "100%"
	 */
	@Override
	public void setHeight(String height) {
		super.setHeight(height);
		this.height = height;
	}

	/**
	 * @param width
	 *            width in pixel or percentage e.g. for 100px - "100" for 100% - "100%"
	 */
	@Override
	public void setWidth(String width) {
		super.setWidth(width);
		this.width = width;
	}

	public void formatAllContent() {
		editor.formatAllContent();
	}

	public void autoFormatRange(Cursor from, Cursor to) {
		editor.autoFormatRange(from, to);
	}

}
