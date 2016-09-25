INFERANALYZE= /usr/local/Cellar/infer/0.8.1/libexec/infer/lib/python/inferlib/../../../bin/InferAnalyze $(INFER_OPTIONS) -results_dir '/Users/abdelrahman/Downloads/infer-master/examples/android_hello/infer-out'

CLUSTERS=cl1 cl2 cl3 cl4 cl5 

default: test

all: test

test: $(CLUSTERS)
	echo ""
#/Users/abdelrahman/Downloads/infer-master/examples/android_hello/infer-out/captured/BuildConfig.java.a52b9deac12a4de086bc1c4efb26c365
cl1: 
	$(INFERANALYZE) -cluster xcl1.cluster >cl1

#/Users/abdelrahman/Downloads/infer-master/examples/android_hello/infer-out/captured/MainActivity.java.a23d1cdba544f37f6ccc930bda45fe5f
cl2: 
	$(INFERANALYZE) -cluster xcl2.cluster >cl2

#/Users/abdelrahman/Downloads/infer-master/examples/android_hello/infer-out/captured/MainActivity.java.ac2aacfebbde13ecd1fd5713040e57c5
cl3: 
	$(INFERANALYZE) -cluster xcl3.cluster >cl3

#/Users/abdelrahman/Downloads/infer-master/examples/android_hello/infer-out/captured/R.java.113a05b5e22f8efaacbb26effcdc42dd
cl4: 
	$(INFERANALYZE) -cluster xcl4.cluster >cl4

#/Users/abdelrahman/Downloads/infer-master/examples/android_hello/infer-out/captured/R.java.99ffd166a8154b5ba690dc0366a08c9b
cl5: 
	$(INFERANALYZE) -cluster xcl5.cluster >cl5


clean:
	rm -f $(CLUSTERS)
