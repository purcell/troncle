(defproject troncle "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [nrepl-discover "0.1.0"]
                 [org.clojure/tools.reader "0.7.10"]
                 [caribou/clojure.walk2 "0.1.0"]]
  :repl-options {:nrepl-middleware [nrepl.discover/wrap-discover]})

