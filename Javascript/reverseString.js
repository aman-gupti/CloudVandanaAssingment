function reverseString(str) {
    let reversed = '';
    for (let i = str.length - 1; i >= 0; i--) {
      reversed += str[i];
    }
    return reversed;
  }
  function reverseWordsInSentence(sentence) {
    const words = sentence.split(' ');
    const reversedWords = [];
  
    for (let i = 0; i < words.length; i++) {
      const word = words[i];
      const reversedWord = reverseString(word);
      reversedWords.push(reversedWord);
    }
  
    const reversedSentence = reversedWords.join(' ');
    return reversedSentence;
  }
  const inputSentence = prompt('Enter a sentence:');
  
  if (inputSentence) {
    const reversedSentence = reverseWordsInSentence(inputSentence);
    console.log('Reversed Sentence: ' + reversedSentence);
  } else {
    console.log('You did not enter a sentence.');
  }