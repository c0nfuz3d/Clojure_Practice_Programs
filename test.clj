;this first line is kinda important
(clojure.core/use 'clojure.core)
;apparently this is how you comment

;this is a comparison
(< 4 5)

;an if-then statement
(if (< 4 5) 4)

;this is how you assign a variable a value
(def astring "a string")

; this is how you create a list and assign it to a variable
(def fruit (list "apple" "apple" "banana" "cherry"))

;vectors
(def greek(vector "alpha" "beta" "gamma"))

;creating a set and assigning it to a variable
(def boys (hash-set "Aron" "Bob" "Cameron"))
;check to see if the set contains the given string
(contains? boys "Bob")


;this is how you create a function. the string in the middle is supposed to be documentation
(defn add "adds two numbers" [x y] (+ x y))
;using the function
(add 4 5)

;heres a for loop
(for [i (range 10)] (+ i 1))

;bitwise comparison
(bit-or 10 11)

(bit-and 10 11)

(bit-xor 10 11)

(bit-clear 10 11)

(bit-flip 10 11)

(bit-shift-left 10 1)

(bit-shift-right 10 1)

;structs
(defstruct point :x :y)

(def p (struct point 0 0))

;returns the sequence of elements with duplicates removed
(distinct fruit)
