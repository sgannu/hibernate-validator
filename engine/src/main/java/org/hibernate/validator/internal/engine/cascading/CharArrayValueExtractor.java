/*
 * Hibernate Validator, declare and validate application constraints
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package org.hibernate.validator.internal.engine.cascading;

import org.hibernate.validator.spi.cascading.ValueExtractor;

class CharArrayValueExtractor implements ValueExtractor<char[]> {

	static final CharArrayValueExtractor INSTANCE = new CharArrayValueExtractor();

	private CharArrayValueExtractor() {
	}

	@Override
	public void extractValues(char[] originalValue, ValueReceiver receiver) {
		int i = 0;
		for ( char object : originalValue ) {
			receiver.indexedValue( object, "<collection element>", i );
			i++;
		}
	}
}
