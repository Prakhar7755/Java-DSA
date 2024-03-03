Sure, here are some of the most commonly used methods from the Integer, Character, and String classes in Java:

**Integer Class:**
1. `parseInt(String s)`: Parses the string argument as a signed decimal integer.
2. `valueOf(int i)`: Returns an Integer instance representing the specified int value.
3. `intValue()`: Returns the value of this Integer as an int.
4. `equals(Object obj)`: Compares this object to the specified object.
5. `toString()`: Returns a String object representing this Integer's value.
6. `compare(int x, int y)`: Compares two int values numerically.
7. `doubleValue()`: Returns the value of this Integer as a double.
8. `floatValue()`: Returns the value of this Integer as a float.
9. `longValue()`: Returns the value of this Integer as a long.
10. `shortValue()`: Returns the value of this Integer as a short.
11. `byteValue()`: Returns the value of this Integer as a byte.
12. `compareTo(Integer anotherInteger)`: Compares two Integer objects numerically.
13. `decode(String nm)`: Decodes a String into an Integer.
14. `highestOneBit(int i)`: Returns an int value with at most a single one-bit, in the position of the highest-order ("leftmost") one-bit in the specified int value.
15. `lowestOneBit(int i)`: Returns an int value with at most a single one-bit, in the position of the lowest-order ("rightmost") one-bit in the specified int value.

**Character Class:**
1. `isDigit(char ch)`: Determines if the specified character is a digit.
2. `isLetter(char ch)`: Determines if the specified character is a letter.
3. `isUpperCase(char ch)`: Determines if the specified character is uppercase.
4. `isLowerCase(char ch)`: Determines if the specified character is lowercase.
5. `toUpperCase(char ch)`: Converts the character argument to uppercase.
6. `toLowerCase(char ch)`: Converts the character argument to lowercase.
7. `isWhitespace(char ch)`: Determines if the specified character is white space.
8. `isLetterOrDigit(char ch)`: Determines if the specified character is a letter or digit.
9. `digit(char ch, int radix)`: Determines the character's integer value in the specified radix.
10. `getNumericValue(char ch)`: Returns the int value that the specified Unicode character represents.
11. `isAlphabetic(int codePoint)`: Determines if the specified character (Unicode code point) is alphabetic.
12. `isBmpCodePoint(int codePoint)`: Determines if the specified character (Unicode code point) is in the Basic Multilingual Plane (BMP).
13. `isIdentifierIgnorable(char ch)`: Determines if the specified character should be regarded as an ignorable character in a Java identifier or a Unicode identifier.
14. `isISOControl(char ch)`: Determines if the specified character is an ISO control character.
15. `isValidCodePoint(int codePoint)`: Determines if the specified character (Unicode code point) is valid.

**String Class:**
1. `length()`: Returns the length of this string.
2. `charAt(int index)`: Returns the char value at the specified index.
3. `substring(int beginIndex, int endIndex)`: Returns a new string that is a substring of this string.
4. `indexOf(int ch)`: Returns the index within this string of the first occurrence of the specified character.
5. `equals(Object anObject)`: Compares this string to the specified object.
6. `equalsIgnoreCase(String anotherString)`: Compares this String to another String, ignoring case considerations.
7. `contains(CharSequence s)`: Returns true if and only if this string contains the specified sequence of char values.
8. `startsWith(String prefix)`: Tests if this string starts with the specified prefix.
9. `endsWith(String suffix)`: Tests if this string ends with the specified suffix.
10. `replace(char oldChar, char newChar)`: Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.
11. `split(String regex)`: Splits this string around matches of the given regular expression.
12. `toLowerCase()`: Converts all of the characters in this String to lower case using the rules of the default locale.
13. `toUpperCase()`: Converts all of the characters in this String to upper case using the rules of the default locale.
14. `trim()`: Returns a copy of the string, with leading and trailing whitespace omitted.
15. `valueOf(Object obj)`: Returns the string representation of the Object argument.

These methods are fundamental to manipulating integers, characters, and strings in Java. However, there are many more methods available in these classes, and the "importance" of a method can vary depending on the specific use case. It's always a good idea to refer to the [Java API documentation](https://docs.oracle.com/en/java/javase/11/docs/api/index.html) for a comprehensive list of methods and their descriptions.