(ns lexer
  (:require [grammer :as g]))

(defn zip-count [coll] 
  (map vector coll (range 1 (inc (count coll)))))

(defn add-line-and-char-numbers [lines]
  (zip-count (map zip-count lines)))

(defn to-token [ln [c cn]]
  (println (str ln ":" cn "\t\t" c)))

(defn to-tokens [[line ln]]
  (map (partial to-token ln) line))

(defn tokenize [lines]
  (-> lines
      add-line-and-char-numbers
      to-tokens))

(def test-lines 
  ["hello"
   "welcome to:"
   "a brave new world"])

(tokenize test-lines)

(to-token 10 ["a" 2])

(+ 1 2)
