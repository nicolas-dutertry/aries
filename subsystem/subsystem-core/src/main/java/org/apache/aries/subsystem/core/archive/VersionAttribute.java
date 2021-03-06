/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.aries.subsystem.core.archive;

import org.osgi.framework.Constants;
import org.osgi.framework.Version;

public class VersionAttribute extends AbstractAttribute {
	public static final String NAME = Constants.VERSION_ATTRIBUTE;
	
	public static final VersionAttribute DEFAULT = new VersionAttribute();
	
	public VersionAttribute() {
		this(Version.emptyVersion.toString());
	}
	
	public VersionAttribute(String value) {
		super(NAME, Version.parseVersion(value));
	}

	public Version getVersion() {
		return (Version)getValue();
	}
}
