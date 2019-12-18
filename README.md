# PigLatin-TDD

Assignment developed during Software Testing Class using Test Driven Development:

Pig Latin is an English language game that alters each word of a phrase, individually, on the basis on some rules (see below). 
The Pig Latin program is a translator of English phrases into the Pig Latin language. In particular, given an input phrase, the Pig Latin program returns the Pig Latin translation of the input phrase.

### Story 1:

•	a phrase is a string (i.e., a sequence of characters) made up of several words split by a single space (i.e., multiple spaces are not allowed). Note that a phrase can contain English letters and the space character only (e.g., the character ‘,’ is not allowed). Furthermore, spaces are not allowed at the beginning and end of phrase. 
•	if the word starts with a vowel, the translated word is simply the input + “ay” (e.g. “apple” -> “appleay”).
•	in case the word begins with a consonant, in the translated word the consonant is first moved to the end, then the “ay” is appended likewise (e.g. “bird” -> “irdbay”).
•	test the case of whole phrase (“a yellow bird” -> “aay ellowyay irdbay”).

### Story 2:

•	handle consonant clusters like “ch”, “th”, “thr”, “sch” at the word’s beginning like a single consonant (e.g. “chair” -> “airchay”, “thread” -> “eadthray”).
•	handle “xr” at the word’s beginning like vowels (“xray” -> “xrayay”)

### Story 3:

•	uppercase input should yield uppercase output (e.g. “APPLE” -> “APPLEAY”)
•	also titlecase input should be kept intact, the first letter should still be uppercase (e.g. “Bird” -> “Irdbay”)
•	other cases, different from the ones above, are not allowed (e.g., “biRd” or “BiRd”).
