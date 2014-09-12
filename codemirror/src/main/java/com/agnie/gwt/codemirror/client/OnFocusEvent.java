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

import com.google.gwt.event.shared.GwtEvent;

/**
 * @author Pandurang Patil 12-Sep-2014
 *
 */
public class OnFocusEvent extends GwtEvent<OnFocusHandler> {

	public static Type<OnFocusHandler>	TYPE	= new Type<OnFocusHandler>();

	Editor								editor;

	public OnFocusEvent(Editor editor) {
		super();
		this.editor = editor;
	}

	public Editor getEditor() {
		return editor;
	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<OnFocusHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(OnFocusHandler handler) {
		handler.onFocus(this);
	}
}
