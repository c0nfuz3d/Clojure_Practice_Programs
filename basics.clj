;ME: You can do single line comments using semicolons or by using a function:

(comment multiline comments
  are
  done
  like
  this)

;YOU: What's with the parenthesis? Why did we use the actual word "comment" here?
;ME: Well, that's how we use functions in Clojure. Clojure follows Lisp style syntax: (functionname parameters)
;Here we called a function named "comment" and gave it a bunch of words.
;Notice that each of those words were separated by spaces instead of commas.
;This is a weird way to do comments so I'm not going to use it anymore.
;Let's look at some more code. How about defining a variable?

(def x 2)

;YOU: Okay "def" makes sense because we're def-ining but why are we still using parenthesis?
;ME: Since Clojure is a functional programming language, every operation is done with a function.

;YOU: Does that mean if I want to do math I have to use a function?
;ME: Well, yeah. Look:

(+ x 2);4
(- x 2);0
(* x 2);4
(/ x 2);1

;YOU: Woah that seems backwards.
;ME: Well not if you read it as a function. For instance, '+' means "add" so you would read that first function as "add x and 2"
;YOU: That kinda makes sense. What about '=' though? You didn't put that one up.
;ME: Okay here you go:

(= x 2);true

;YOU: Why did it return true?
;ME: In Clojure '=' is used for testing equivalence. In this case the variable x is equivalent to 2.
;YOU: So what do we do when we want to assign a value to a variable?
;ME: I already showed you. You use the "def" function.
;YOU: But 'x' already exists. We don't need to define it again.
;ME: Actually, you do. In Clojure, data is immutable; that is, it can not be changed.
;Everytime we want to change the value of something, we have to redefine it.
;YOU: That's dumb.