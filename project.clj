(defproject clojure-boost "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [ultra-csv "0.2.3"]
                 [org.clojure/data.csv "1.0.1"]
                 [clojure.java-time "0.3.3"]]
  :repl-options {:init-ns clojure-boost.core})
