(defproject myrec-pdf "0.1.0-SNAPSHOT"
	:dependencies [[org.clojure/clojure "1.10.0"]
		[pdfboxing "0.1.14"]]
	:main ^:skip-aot myrec-pdf.core
	:target-path "target/%s"
	:profiles {:uberjar {:aot :all}})
