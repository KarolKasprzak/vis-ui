/*
 * Spine Runtimes Software License
 * Version 2.1
 * Copyright (c) 2013, Esoteric Software
 * All rights reserved.
 *
 * You are granted a perpetual, non-exclusive, non-sublicensable and
 * non-transferable license to install, execute and perform the Spine Runtimes
 * Software (the "Software") solely for internal use. Without the written
 * permission of Esoteric Software (typically granted by licensing Spine), you
 * may not (a) modify, translate, adapt or otherwise create derivative works,
 * improvements of the Software or develop new applications using the Software
 * or (b) remove, delete, alter or obscure any trademarks or any copyright,
 * trademark, patent or other intellectual property or proprietary rights
 * notices on or in the Software, including any copy thereof. Redistributions
 * in binary or source form must include this license and terms.
 *
 * THIS SOFTWARE IS PROVIDED BY ESOTERIC SOFTWARE "AS IS" AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO
 * EVENT SHALL ESOTERIC SOFTARE BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR
 * OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.kotcrab.vis.plugin.spine.runtime;

import com.badlogic.gdx.graphics.Color;
import com.kotcrab.vis.runtime.data.EntityData;

public class SpineData extends EntityData<SpineEntity> {
	public String skeletonPath;
	public String atlasPath;
	public float x, y;
	public boolean flipX, flipY;
	public Color color;

	public float scale;

	@Override
	public void saveFrom (SpineEntity entity) {
		id = entity.getId();
		skeletonPath = entity.getAssetPath();
		atlasPath = entity.getAtlasPath();
		x = entity.getX();
		y = entity.getY();
		flipX = entity.isFlipX();
		flipY = entity.isFlipY();
	}

	@Override
	public void loadTo (SpineEntity entity) {
		entity.setId(id);
		entity.setAssetPath(skeletonPath);
		entity.setAtlasPath(atlasPath);
		entity.setPosition(x, y);
		entity.setFlip(flipX, flipY);
	}
}
