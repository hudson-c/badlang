(defproject badlang "0.1"
  :description "a small interpreter for a lisp like language."
  :url "https://github.com/hudson-c/badlang"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main ^:skip-aot badlang.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
