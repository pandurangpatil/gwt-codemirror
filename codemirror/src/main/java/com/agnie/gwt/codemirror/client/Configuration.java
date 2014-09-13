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
import com.google.gwt.core.client.JsArrayString;

/**
 * Code mirror Configuration
 * 
 * TODO: Note: Following properties are not supported as it required to have callback mechanism. -specialCharPlaceholder
 * -lineNumberFormatter
 * 
 * @author Pandurang Patil 11-Sep-2014
 *
 */
public class Configuration extends JavaScriptObject {

	protected Configuration() {
	}

	/**
	 * The starting value of the editor.
	 * 
	 * @param value
	 */
	public final native void setValue(String value)
	/*-{
		this.value = value;
	}-*/;

	/**
	 * The mode to use. When not given, this will default to the first mode that was loaded. It may be a string, which
	 * either simply names the mode or is a MIME type associated with the mode. Alternatively, it may be an object
	 * containing configuration options for the mode, with a name property that names the mode (for example {name:
	 * "javascript", json: true}). The demo pages for each mode contain information about what configuration parameters
	 * the mode supports. You can ask CodeMirror which modes and MIME types have been defined by inspecting the
	 * CodeMirror.modes and CodeMirror.mimeModes objects. The first maps mode names to their constructors, and the
	 * second maps MIME types to mode specs.
	 * 
	 * @param mode
	 */
	public final native void setMode(Mode mode)
	/*-{
		this.mode = mode;
	}-*/;

	/**
	 * The mode to use. When not given, this will default to the first mode that was loaded. It may be a string, which
	 * either simply names the mode or is a MIME type associated with the mode. Alternatively, it may be an object
	 * containing configuration options for the mode, with a name property that names the mode (for example {name:
	 * "javascript", json: true}). The demo pages for each mode contain information about what configuration parameters
	 * the mode supports. You can ask CodeMirror which modes and MIME types have been defined by inspecting the
	 * CodeMirror.modes and CodeMirror.mimeModes objects. The first maps mode names to their constructors, and the
	 * second maps MIME types to mode specs.
	 * 
	 * @param theme
	 */
	public final native void setTheme(String theme)
	/*-{
		this.theme = theme;
	}-*/;

	/**
	 * How many spaces a block (whatever that means in the edited language) should be indented. The default is 2.
	 * 
	 * @param indentUnit
	 */
	public final native void setIndentUnit(Integer indentUnit)
	/*-{
		this.indentUnit = indentUnit;
	}-*/;

	/**
	 * Whether to use the context-sensitive indentation that the mode provides (or just indent the same as the line
	 * before). Defaults to true.
	 * 
	 * @param smartIndent
	 */
	public final native void setSmartIndent(Boolean smartIndent)
	/*-{
		this.smartIndent = smartIndent;
	}-*/;

	/**
	 * The width of a tab character. Defaults to 4.
	 * 
	 * @param tabSize
	 */
	public final native void setTabSize(Integer tabSize)
	/*-{
		this.tabSize = tabSize;
	}-*/;

	/**
	 * Whether, when indenting, the first N*tabSize spaces should be replaced by N tabs. Default is false.
	 * 
	 * @param indentWithTabs
	 */
	public final native void setIndentWithTabs(Boolean indentWithTabs)
	/*-{
		this.indentWithTabs = indentWithTabs;
	}-*/;

	/**
	 * Configures whether the editor should re-indent the current line when a character is typed that might change its
	 * proper indentation (only works if the mode supports indentation). Default is true.
	 * 
	 * @param electricChars
	 */
	public final native void setElectricChars(Boolean electricChars)
	/*-{
		this.electricChars = electricChars;
	}-*/;

	/**
	 * A regular expression used to determine which characters should be replaced by a special placeholder. Mostly
	 * useful for non-printing special characters. The default is /[\u0000-\u0019\u00ad\u200b\u2028\u2029\ufeff]/.
	 * 
	 * @param specialChars
	 */
	public final native void setSpecialChars(String specialChars)
	/*-{
		this.specialChars = specialChars;
	}-*/;

	/**
	 * Determines whether horizontal cursor movement through right-to-left (Arabic, Hebrew) text is visual (pressing the
	 * left arrow moves the cursor left) or logical (pressing the left arrow moves to the next lower index in the
	 * string, which is visually right in right-to-left text). The default is false on Windows, and true on other
	 * platforms.
	 * 
	 * @param rtlMoveVisually
	 */
	public final native void setRtlMoveVisually(Boolean rtlMoveVisually)
	/*-{
		this.rtlMoveVisually = rtlMoveVisually;
	}-*/;

	/**
	 * Configures the key map to use. The default is "default", which is the only key map defined in codemirror.js
	 * itself. Extra key maps are found in the key map directory. See the section on key maps for more information.
	 * 
	 * @param keyMap
	 */
	public final native void setKeyMap(String keyMap)
	/*-{
		this.keyMap = keyMap;
	}-*/;

	/**
	 * Can be used to specify extra key bindings for the editor, alongside the ones defined by keyMap. Should be either
	 * null, or a valid key map value.
	 * 
	 * @param extraKeys
	 */
	public final native void setExtraKeys(JavaScriptObject extraKeys)
	/*-{
		this.extraKeys = extraKeys;
	}-*/;

	/**
	 * Whether CodeMirror should scroll or wrap for long lines. Defaults to false (scroll).
	 * 
	 * @param lineWrapping
	 */
	public final native void setLineWrapping(Boolean lineWrapping)
	/*-{
		this.lineWrapping = lineWrapping;
	}-*/;

	/**
	 * Whether to show line numbers to the left of the editor.
	 * 
	 * @param lineNumbers
	 */
	public final native void setLineNumbers(Boolean lineNumbers)
	/*-{
		this.lineNumbers = lineNumbers;
	}-*/;

	/**
	 * At which number to start counting lines. Default is 1.
	 * 
	 * @param firstLineNumber
	 */
	public final native void setFirstLineNumber(Integer firstLineNumber)
	/*-{
		this.firstLineNumber = firstLineNumber;
	}-*/;

	/**
	 * Can be used to add extra gutters (beyond or instead of the line number gutter). Should be an array of CSS class
	 * names, each of which defines a width (and optionally a background), and which will be used to draw the background
	 * of the gutters. May include the CodeMirror-linenumbers class, in order to explicitly set the position of the line
	 * number gutter (it will default to be to the right of all other gutters). These class names are the keys passed to
	 * setGutterMarker.
	 * 
	 * @param gutters
	 *            array<string>
	 */
	public final native void setGutters(JsArrayString gutters)
	/*-{
		this.gutters = gutters;
	}-*/;

	/**
	 * Determines whether the gutter scrolls along with the content horizontally (false) or whether it stays fixed
	 * during horizontal scrolling (true, the default).
	 * 
	 * @param fixedGutter
	 */
	public final native void setFixedGutter(Boolean fixedGutter)
	/*-{
		this.fixedGutter = fixedGutter;
	}-*/;

	/**
	 * When fixedGutter is on, and there is a horizontal scrollbar, by default the gutter will be visible to the left of
	 * this scrollbar. If this option is set to true, it will be covered by an element with class
	 * CodeMirror-gutter-filler.
	 * 
	 * @param coverGutterNextToScrollbar
	 */
	public final native void setCoverGutterNextToScrollbar(Boolean coverGutterNextToScrollbar)
	/*-{
		this.coverGutterNextToScrollbar = coverGutterNextToScrollbar;
	}-*/;

	/**
	 * This disables editing of the editor content by the user. Use setNoFocus() to disallow focusing of editor
	 * 
	 * @param readOnly
	 */
	public final native void setReadOnly(Boolean readOnly)
	/*-{
		this.readOnly = readOnly;
	}-*/;

	/**
	 * disallow focusing of editor
	 */
	public final native void setNoFocus()
	/*-{
		this.readOnly = 'nocursor';
	}-*/;

	/**
	 * Whether the cursor should be drawn when a selection is active. Defaults to false.
	 * 
	 * @param showCursorWhenSelecting
	 */
	public final native void setShowCursorWhenSelecting(Boolean showCursorWhenSelecting)
	/*-{
		this.showCursorWhenSelecting = showCursorWhenSelecting;
	}-*/;

	/**
	 * The maximum number of undo levels that the editor stores. Note that this includes selection change events.
	 * Defaults to 200.
	 * 
	 * @param undoDepth
	 */
	public final native void setUndoDepth(Integer undoDepth)
	/*-{
		this.undoDepth = undoDepth;
	}-*/;

	/**
	 * The period of inactivity (in milliseconds) that will cause a new history event to be started when typing or
	 * deleting. Defaults to 1250.
	 * 
	 * @param historyEventDelay
	 */
	public final native void setHistoryEventDelay(Integer historyEventDelay)
	/*-{
		this.historyEventDelay = historyEventDelay;
	}-*/;

	/**
	 * The tab index to assign to the editor. If not given, no tab index will be assigned.
	 * 
	 * @param tabindex
	 */
	public final native void setTabindex(Integer tabindex)
	/*-{
		this.tabindex = tabindex;
	}-*/;

	/**
	 * Can be used to make CodeMirror focus itself on initialization. Defaults to off. When fromTextArea is used, and no
	 * explicit value is given for this option, it will be set to true when either the source textarea is focused, or it
	 * has an autofocus attribute and no other element is focused.
	 * 
	 * @param autofocus
	 */
	public final native void setAutofocus(Boolean autofocus)
	/*-{
		this.autofocus = autofocus;
	}-*/;

	/**
	 * Controls whether drag-and-drop is enabled. On by default.
	 * 
	 * @param dragDrop
	 */
	public final native void setDragDrop(Boolean dragDrop)
	/*-{
		this.dragDrop = dragDrop;
	}-*/;

	/**
	 * Half-period in milliseconds used for cursor blinking. The default blink rate is 530ms. By setting this to zero,
	 * blinking can be disabled. A negative value hides the cursor entirely.
	 * 
	 * @param cursorBlinkRate
	 */
	public final native void setCursorBlinkRate(Integer cursorBlinkRate)
	/*-{
		this.cursorBlinkRate = cursorBlinkRate;
	}-*/;

	/**
	 * How much extra space to always keep above and below the cursor when approaching the top or bottom of the visible
	 * view in a scrollable document. Default is 0.
	 * 
	 * @param cursorScrollMargin
	 */
	public final native void setCursorScrollMargin(Integer cursorScrollMargin)
	/*-{
		this.cursorScrollMargin = cursorScrollMargin;
	}-*/;

	/**
	 * Determines the height of the cursor. Default is 1, meaning it spans the whole height of the line. For some fonts
	 * (and by some tastes) a smaller height (for example 0.85), which causes the cursor to not reach all the way to the
	 * bottom of the line, looks better
	 * 
	 * @param cursorHeight
	 */
	public final native void setCursorHeight(Integer cursorHeight)
	/*-{
		this.cursorHeight = cursorHeight;
	}-*/;

	/**
	 * Controls whether, when the context menu is opened with a click outside of the current selection, the cursor is
	 * moved to the point of the click. Defaults to true.
	 * 
	 * @param resetSelectionOnContextMenu
	 */
	public final native void setResetSelectionOnContextMenu(Boolean resetSelectionOnContextMenu)
	/*-{
		this.resetSelectionOnContextMenu = resetSelectionOnContextMenu;
	}-*/;

	/**
	 * Highlighting is done by a pseudo background-thread that will work for workTime milliseconds, and then use timeout
	 * to sleep for workDelay milliseconds. The defaults are 200 and 300, you can change these options to make the
	 * highlighting more or less aggressive.
	 * 
	 * @param workTime
	 */
	public final native void setWorkTime(Integer workTime)
	/*-{
		this.workTime = workTime;
	}-*/;

	/**
	 * Highlighting is done by a pseudo background-thread that will work for workTime milliseconds, and then use timeout
	 * to sleep for workDelay milliseconds. The defaults are 200 and 300, you can change these options to make the
	 * highlighting more or less aggressive.
	 * 
	 * @param workDelay
	 */
	public final native void setWorkDelay(Integer workDelay)
	/*-{
		this.workDelay = workDelay;
	}-*/;

	/**
	 * Indicates how quickly CodeMirror should poll its input textarea for changes (when focused). Most input is
	 * captured by events, but some things, like IME input on some browsers, don't generate events that allow CodeMirror
	 * to properly detect it. Thus, it polls. Default is 100 milliseconds.
	 * 
	 * @param pollInterval
	 */
	public final native void setPollInterval(Integer pollInterval)
	/*-{
		this.pollInterval = pollInterval;
	}-*/;

	/**
	 * By default, CodeMirror will combine adjacent tokens into a single span if they have the same class. This will
	 * result in a simpler DOM tree, and thus perform better. With some kinds of styling (such as rounded corners), this
	 * will change the way the document looks. You can set this option to false to disable this behavior.
	 * 
	 * @param flattenSpans
	 */
	public final native void setFlattenSpans(Boolean flattenSpans)
	/*-{
		this.flattenSpans = flattenSpans;
	}-*/;

	/**
	 * When enabled (off by default), an extra CSS class will be added to each token, indicating the (inner) mode that
	 * produced it, prefixed with "cm-m-". For example, tokens from the XML mode will get the cm-m-xml class.
	 * 
	 * @param addModeClass
	 */

	public final native void setAddModeClass(Boolean addModeClass)
	/*-{
		this.addModeClass = addModeClass;
	}-*/;

	/**
	 * When highlighting long lines, in order to stay responsive, the editor will give up and simply style the rest of
	 * the line as plain text when it reaches a certain position. The default is 10 000. You can set this to Infinity to
	 * turn off this behavior.
	 * 
	 * @param maxHighlightLength
	 */
	public final native void setMaxHighlightLength(Integer maxHighlightLength)
	/*-{
		this.maxHighlightLength = maxHighlightLength;
	}-*/;

	/**
	 * When measuring the character positions in long lines, any line longer than this number (default is 10 000), when
	 * line wrapping is off, will simply be assumed to consist of same-sized characters. This means that, on the one
	 * hand, measuring will be inaccurate when characters of varying size, right-to-left text, markers, or other
	 * irregular elements are present. On the other hand, it means that having such a line won't freeze the user
	 * interface because of the expensiveness of the measurements.
	 * 
	 * @param crudeMeasuringFrom
	 */
	public final native void setCrudeMeasuringFrom(Integer crudeMeasuringFrom)
	/*-{
		this.crudeMeasuringFrom = crudeMeasuringFrom;
	}-*/;

	/**
	 * Specifies the amount of lines that are rendered above and below the part of the document that's currently
	 * scrolled into view. This affects the amount of updates needed when scrolling, and the amount of work that such an
	 * update does. You should usually leave it at its default, 10. Can be set to Infinity to make sure the whole
	 * document is always rendered, and thus the browser's text search works on it. This will have bad effects on
	 * performance of big documents.
	 * 
	 * @param viewportMargin
	 */
	public final native void setViewportMargin(Integer viewportMargin)
	/*-{
		this.viewportMargin = viewportMargin;
	}-*/;

	/**
	 * Enables auto closing of brackets require to inherit from com.agnie.gwt.codemirror.addon.edit_closebrackets module
	 * 
	 * Defines an option autoCloseBrackets that will auto-close brackets and quotes when typed. By default, it'll
	 * auto-close ()[]{}''"", but you can pass it a string similar to that (containing pairs of matching characters), or
	 * an object with pairs and optionally explode properties to customize it. explode should be a similar string that
	 * gives the pairs of characters that, when enter is pressed between them, should have the second character also
	 * moved to its own line.
	 * 
	 * @param autoCloseBrackets
	 */
	public final native void setAutoCloseBrackets(Boolean autoCloseBrackets)
	/*-{
		this.autoCloseBrackets = autoCloseBrackets;
	}-*/;

	/**
	 * Enables auto closing of xml tags require to inherit from com.agnie.gwt.codemirror.addon.edit_closetags module
	 * 
	 * @param autoCloseTags
	 */
	public final native void setAutoCloseTags(Boolean autoCloseTags)
	/*-{
		this.autoCloseTags = autoCloseTags;
	}-*/;

	/**
	 * Defines an option matchTags that, when enabled, will cause the tags around the cursor to be highlighted (using
	 * the CodeMirror-matchingtag class). Also defines a command toMatchingTag, which you can bind a key to in order to
	 * jump to the tag mathing the one under the cursor. Depends on the addon/fold/xml-fold.js addon. Demo here.
	 * 
	 * require to inherit from com.agnie.gwt.codemirror.addon.edit_matchbrackets module
	 * 
	 * @param matchBrackets
	 */
	public final native void setMatchBrackets(Boolean matchBrackets)
	/*-{
		this.matchBrackets = matchBrackets;
	}-*/;

	/**
	 * Defines an option matchTags that, when enabled, will cause the tags around the cursor to be highlighted (using
	 * the CodeMirror-matchingtag class). Also defines a command toMatchingTag, which you can bind a key to in order to
	 * jump to the tag mathing the one under the cursor. Depends on the addon/fold/xml-fold.js addon.
	 * 
	 * require to inherit from com.agnie.gwt.codemirror.addon.edit_matchtags module
	 * 
	 * @param matchTags
	 */
	public final native void setMatchTags(Boolean matchTags)
	/*-{
		this.matchTags = matchTags;
	}-*/;
}
