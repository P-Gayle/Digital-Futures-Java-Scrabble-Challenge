## USER STORY
As a scrabble player  
So I can determine the winner of the game  
I want to calculate the score of each word played

## DOMAIN MODEL

| Objects  | Properties            | Messages | Outputs  |
|----------|-----------------------|----------|----------|
| Scrabble | letterValues @hashMap | score()  | @integer |
|          | word @String          |          |          |
|          | letter @Char          |          |          |
|          | result @int           |          |          |

## APPROACH
- Pass the first two tests by checking for empty words
- Set up the hashMap and add the key value pairs (I maybe could have 'put' the values in using a loop to reduce the amount of code)
- Made the word input case-insensitive by making it lowercase before calculation
- Use a forEach loop to iterate through the hashMap: 
  - convert the word into an array of letters
  - for each letter of the char array get the value of the letter using the key 'letter' and add the values to the result
  

## REFERENCES

- https://rollbar.com/blog/how-to-resolve-the-cannot-find-symbol-error-in-java/
- https://www.w3schools.com/java/java_hashmap.asp
- https://www.geeksforgeeks.org/hashmap-get-method-in-java/
- https://www.geeksforgeeks.org/java-string-tochararray-example/
- https://www.w3schools.com/java/java_foreach_loop.asp