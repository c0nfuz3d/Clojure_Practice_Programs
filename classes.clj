;In clojure, there are multiple ways to make a class-like data structure
;;One way is to make a struct:
(defstruct point :x :y)
(def p (struct point 0 0))

;;The most popular way to make a class is to use a record. This is one without methods:
(defrecord Rectangle [length width])

;;In order to make methods in a record, you need to first make a protocol or interface
;;;This is a protocol
(defprotocol Shape
  (area [a*]);The '*' indicates that the parameter is optional
  (perimeter [p*] "calculates the perimeter"));You can add documentation too if you want

;;This time we will define the record with methods
(defrecord Rectangle [length width]
  Shape
  (area [a*] (* length width))
  (perimeter [p*] (+ (* length 2) (* length 2)))
)

;When you create an instance, don't forget the '.' after the class name
(def rect (Rectangle. 5 10))

;You can use dot syntax to call member variables and methods
(.length rect)
(.width rect)
(.area rect)
(.perimeter rect)

