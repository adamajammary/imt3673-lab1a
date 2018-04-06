# imt3673-lab1a
IMT3673 Lab 1A (Android, Java, Go Mobile) 

Create an application consisting of 2 activities. 

## The first, entry activity (A1), should have
* editable text field (T1)
* a drop-down list of options (L1)
  * The options should consists of SHA256, SHA3-256, RIPEMD160, BLAKE2s-256
  * See [hashing algorithms](https://golang.org/pkg/crypto/#Hash) 
* a button (B1), with caption "Hash"

## The second activity (A2) should have:
* non-editable text field (T2)
* another non-editable text field (T3)
* a button (B2), called "Quit" - pressing that button makes the app to close. Back button makes the app to go back to A1.

## The idea
The app will combine the Java-written UI, and Golang written hashing logic, to calculate Hash of a given plain-text entry. The entry entered in Activity A1 (a text in T1), will be hashed with a chosen hashing algorithm from the drop-down list, using Golang, and, the result will be shown (T3), together with 'plain text' (T2), in Activity A2.

## Checklist
* The git repository URL is correctly provided, such that command works: git clone <url>
* When a user presses B1, activity A2 becomes active.
* When a user presses B2, the app closes.
* When a user presses B1, activity A2 becomes active, and the field T2 has the same entry as the text in T1.
* When a user presses Back button from A2, she will go to A1.
* When a user presses Back button from A1, it will quit the app.
* When a user presses B1, T3 shows the hash of text from T1, with a given algorithm picked from the drop-down.

## Hints
* Set yourself up with the [Golang Mobile](https://github.com/golang/go/wiki/Mobile) and check for known issues at gomobile hints and setup.
* Use Java for all the UI, app management, and Activities. Use Golang ONLY for computing the hashes. This is the crux of the exercise. The passing between Java and Golang is only done for "strings" and for the hashing algorithm - how can you represent that? What would be the easiest representation to communicate between Java and Go?
