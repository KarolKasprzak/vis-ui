/*
 * Copyright 2014-2015 See AUTHORS file.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kotcrab.vis.editor.module.scene;

import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.kotcrab.vis.editor.Editor;
import com.kotcrab.vis.editor.module.editor.EditorModule;

/**
 * Allow to add InputListener that will send events from entire editor, ignoring modality of windows etc. Event will
 * be always passes to listeners.
 * @see InputModule
 */
public class GlobalInputModule extends EditorModule {
	private Stage stage;

	@Override
	public void init () {
		stage = Editor.instance.getStage();
	}

	public void addListener (InputListener listener) {
		stage.addListener(listener);
	}

	public boolean removeListener (InputListener listener) {
		return stage.removeListener(listener);
	}
}
