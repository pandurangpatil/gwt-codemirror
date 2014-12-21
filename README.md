gwt-codemirror
===========


   GWT wrapper over GWT wrapper on top of Javascript library of Code mirror http://codemirror.net/index.html 
   
**Usage**
--------
Inherit main GWT module ```	<inherits name="com.agnie.gwt.codemirror.codemirror" />```

CodeMirror library is divived into four major categories. Each category is supposed to have separate module defined for each feature (At the time of writing this, we have added few modules corresponding to each feature, yet to add it for all features).

*Categories*
------------
1. mode - Added few modules(css, xml, javascript, vbscript and htmlmixed) yet to add more refer issue [#2](https://github.com/Agnie-Software/gwt-codemirror/issues/2). To use any specific mode one has to inherit respective module for the same e.g. to use htmlmixed mode inherit ```	<inherits name="com.agnie.gwt.codemirror.mode.htmlmixed" />```.
2. theme - Added one theme (monokai) yet to add more refer issue [#1](https://github.com/Agnie-Software/gwt-codemirror/issues/1). You have to inherit ```<inherits name="com.agnie.gwt.codemirror.theme.monokai" />``` to use monokai theme.
3. addon - Added few addons (closebrackets, xml-fold, matchtags, matchbrackets and closetag it seems close tag is not working) yet to add more refer issue [#5](https://github.com/Agnie-Software/gwt-codemirror/issues/5). You have to inherit  ```<inherits name="com.agnie.gwt.codemirror.addon.edit_closebrackets" />``` to use close bracket feature.
4. keymap - Partially added keymap for VIM. yet to add more refer [#6](https://github.com/Agnie-Software/gwt-codemirror/issues/6), [#7](https://github.com/Agnie-Software/gwt-codemirror/issues/7) and [#8](https://github.com/Agnie-Software/gwt-codemirror/issues/8). You have to inherit ```<inherits name="com.agnie.gwt.codemirror.keymap.vim" />``` to use vim keymap. 


*Programming API and Event handling*
------------------------------------
We have added few programming apis yet to add wrappers for all apis refer issue [#4](https://github.com/Agnie-Software/gwt-codemirror/issues/4). Same goes for event handling to start with we have added event handling mechanism for onfocus event, refer issue [#3](https://github.com/Agnie-Software/gwt-codemirror/issues/3)
     

*Sample*
--------
To use any of the feature like mode, theme, keymap or addon it is not just sufficient to inherit from respective module. You have to set the respective feature with CodeMirror instance, before adding it to panel. e.g. if you want to use 'htmlmixed' mode, with 'monokai' theme and 'vim' keymap along with 'closebrackets' addon. Then following example will show how to do it.
    

your GWT module .gwt.xml

```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE module PUBLIC "-//Google Inc.//DTD Google Web Toolkit 2.6.1//EN" "http://google-web-toolkit.googlecode.com/svn/tags/2.6.1/distro-source/core/src/gwt-module.dtd">
<module rename-to='CodeMirrorTest'>
	<inherits name="com.google.gwt.user.User" />
	<inherits name="com.agnie.gwt.codemirror.codemirror" />
	<inherits name="com.agnie.gwt.codemirror.addon.edit_closebrackets" />
	<inherits name="com.agnie.gwt.codemirror.mode.htmlmixed" />
	<inherits name="com.agnie.gwt.codemirror.theme.monokai" />
	<inherits name="com.agnie.gwt.codemirror.keymap.vim" />
	<source path="client" />
	<entry-point class="com.agnie.gwt.codemirror.test.client.CodeMirrorTest">
	</entry-point>
</module>
```

CodeMirror is UiBinder friendly, so I will show UiBinder usage for the same to set required properties.

your .ui.xml

```
<!DOCTYPE ui:UiBinder SYSTEM "http://dl.google.com/gwt/DTD/xhtml.ent">
<ui:UiBinder xmlns:ui="urn:ui:com.google.gwt.uibinder"
	xmlns:g="urn:import:com.google.gwt.user.client.ui" xmlns:cm="urn:import:com.agnie.gwt.codemirror.client">

	<g:HTMLPanel>
		<cm:CodeMirror mode="HTML_MIXED" theme="MONOKAI"
			lineNumbers="true" autoCloseBrackets="true" keyMap="VIM" ui:field="editor"></cm:CodeMirror>
	</g:HTMLPanel>
</ui:UiBinder> 
```

Fore more detail working sample refer [test](https://github.com/Agnie-Software/gwt-codemirror/tree/master/test) sample project

1. version - 1.1 contains changes to support xsiframe mode.
2. version - 1.2 contains Following changes.
	- support for onBlur handler
	- refresh
	- set height and width
	- added support for formating.js however CodeMirror has stopped supporting it after 3.1 release hence it may contain few issues. For more detail refer Original JavaScript code mirror repo.

**Maven Dependency**
```
	<dependency>
		<groupId>com.agnie.gwt</groupId>
		<artifactId>codemirror</artifactId>
		<version>1.2</version>
		<scope>provided</scope>
	</dependency>
```

**Maven Repository**

```
   <repositories>
      <repository>
         <id>Agnie repo</id>
         <url>https://github.com/Agnie-Software/mvn-repo/raw/master/releases</url>
      </repository>
   </repositories>
```

**Important Note:** 
------
Wrapper for all features are not added, Please feel free to make changes add wrappers for remaining features.
