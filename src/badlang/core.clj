(ns core
  (:require [clojre.java.io :as io]
            [lexer]
            [parser]
            [ast]
            [interpreter]))

(defn load-file [file]
  (with-open [rdr (io/reader file)]
    (into [] (line-seq rdr))))

(-> (load-file (slurp *in*))
    lexer/tokenize
    parser/create-parse-tree
    ast/create-ast
    interpreter/interpret-ast)
