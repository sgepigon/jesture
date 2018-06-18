(ns user
  "Tools for interactive development with the REPL. This file should
  not be included in a production build of the application."
  (:require [clojure.spec.alpha :as spec]
            [clojure.spec.gen.alpha :as spec.gen]
            [clojure.spec.test.alpha :as spec.test]
            [expound.alpha :as expound]
            [jesture.core :as core]))

(set! spec/*explain-out* (expound/custom-printer {:print-specs? false
                                                  :show-valid-values? true
                                                  :theme :figwheel-theme}))
