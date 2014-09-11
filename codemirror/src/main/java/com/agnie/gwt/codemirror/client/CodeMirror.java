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

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.TextAreaElement;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

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

	// Event bus to handl events
	static SimpleEventBus		eventBus		= new SimpleEventBus();
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

	public void setMode(EditorMode mode) {
		GWT.log("Mode is set to " + mode.name());
		Mode configMode = (Mode) Mode.createObject();
		configMode.setName(mode.getMode());
		config.setMode(configMode);
	}

	public void setTheme(String theme) {
		config.setTheme(theme);
	}

	public void setLineNumbers(boolean flag) {
		config.setLineNumbers(flag);
	}

	public void setAutoCloseBrackets(boolean autoCloseBrackets) {
		config.setAutoCloseBrackets(autoCloseBrackets);
	}

	@Override
	protected void onLoad() {
		super.onLoad();
		GWT.log("Editor is being formed.");
		editor = Editor.fromTextArea(txtarea, config);
		// player = Player.createPlayer(divId, playerConfiguration);
	}

	@Override
	protected void onUnload() {
		super.onUnload();
		// player.destroy();
	}

}
