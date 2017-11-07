(defproject clojurejl "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [

[org.clojure/clojure "1.9.0-beta4"] 
[instaparse "1.4.7"]

;; This is for traversing the nested clojure data structure
[com.rpl/specter "1.0.3"]
[prismatic/plumbing "0.5.4"]
;; a better dev experience utility belt
[im.chit/hara "2.5.10"]
[im.chit/lucid "1.3.13"]

;; Shell library
[me.raynes/conch "0.8.0"]

; Quickcheck
[org.clojure/test.check "0.10.0-alpha2"]

;; Asynchronous stuff
[org.clojure/core.async "0.3.443"]

;; Pattern matching in clojure
[org.clojure/core.match "0.3.0-alpha5"]

;; MiniKanren
[org.clojure/core.logic "0.8.11"]


;; all fine till this comment
          ;; Clojure reader in clojure
          [org.clojure/tools.reader "1.0.5"]
                            ;; Clojure AST to EDN
                            [org.clojure/tools.analyzer "0.6.9"]


                            ;; Concrete implementation of tools.analyzer
                            [org.clojure/tools.analyzer.jvm "0.7.0"]



 ]

  :main ^:skip-aot clojurejl.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
