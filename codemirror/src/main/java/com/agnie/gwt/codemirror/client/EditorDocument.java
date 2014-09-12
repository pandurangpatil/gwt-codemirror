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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * @author Pandurang Patil 12-Sep-2014
 *
 */
public class EditorDocument extends JavaScriptObject {

	protected EditorDocument() {

	}

	/**
	 * Get the current editor content. You can pass it an optional argument to specify the string to be used to separate
	 * lines
	 * 
	 * @return
	 */
	public final String getValue() {
		return getValue("\n");
	}

	/**
	 * Get the current editor content. You can pass it an optional argument to specify the string to be used to separate
	 * lines
	 * 
	 * @param separator
	 *            specify the string to be used to separate lines
	 * @return
	 */
	public final native String getValue(String separator)
	/*-{
		return this.getValue(separator);
	}-*/;

	/**
	 * Set the editor content.
	 * 
	 * @param value
	 */
	public final native void setValue(String value)
	/*-{
		this.setValue(value);
	}-*/;

	/**
	 * Get the content of line n.
	 * 
	 * @param n
	 * @return
	 */
	public final native String getLine(int n)
	/*-{
		return this.getLine(n);
	}-*/;

	/**
	 * Get the number of lines in the editor.
	 * 
	 * @return
	 */
	public final native int lineCount()
	/*-{
		return this.lineCount();
	}-*/;

	/**
	 * Get the first line of the editor. This will usually be zero but for linked sub-views, or documents instantiated
	 * with a non-zero first line, it might return other values.
	 * 
	 * @return
	 */
	public final native int firstLine()
	/*-{
		return this.firstLine();
	}-*/;

	/**
	 * Get the last line of the editor. This will usually be doc.lineCount() - 1, but for linked sub-views, it might
	 * return other values.
	 * 
	 * @return
	 */
	public final native int lastLine()
	/*-{
		return this.lastLine();
	}-*/;

	/**
	 * Returns a number that can later be passed to isClean to test whether any edits were made (and not undone) in the
	 * meantime.
	 * 
	 * @param closeEvent
	 *            closeEvent is true, the current history event will be ‘closed’, meaning it can't be combined with
	 *            further changes (rapid typing or deleting events are typically combined).
	 * @return
	 */
	public final native int changeGeneration(boolean closeEvent)
	/*-{
		return this.changeGeneration(closeEvent);
	}-*/;

	/**
	 * Returns whether the document is currently clean — not modified since initialization or the last call to markClean
	 * if no argument is passed, or since the matching call to changeGeneration if a generation value is given.
	 * 
	 * @param generation
	 * @return
	 */
	public final native boolean isClean(int generation)
	/*-{
		return this.isClean(generation);
	}-*/;

	/**
	 * Undo one edit (if any undo events are stored).
	 */
	public final native void undo()
	/*-{
		return this.undo();
	}-*/;

	/**
	 * Redo one undone edit.
	 */
	public final native void redo()
	/*-{
		return this.redo();
	}-*/;

	/**
	 * Undo one edit or selection change.
	 */
	public final native void undoSelection()
	/*-{
		return this.undoSelection();
	}-*/;

	/**
	 * Redo one undone edit or selection change.
	 */
	public final native void redoSelection()
	/*-{
		return this.redoSelection();
	}-*/;
}
