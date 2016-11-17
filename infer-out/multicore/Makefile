INFERANALYZE= /usr/local/Cellar/infer/0.8.1/libexec/infer/lib/python/inferlib/../../../bin/InferAnalyze $(INFER_OPTIONS) -results_dir '/Users/abdelrahman/gain/android_trial/infer-out'

CLUSTERS=cl1 cl2 cl3 cl4 cl5 cl6 

default: test

all: test

test: $(CLUSTERS)
	echo ""
#/Users/abdelrahman/gain/android_trial/infer-out/captured/BuildConfig.java.a52b9deac12a4de086bc1c4efb26c365
cl1: 
	$(INFERANALYZE) -cluster xcl1.cluster >cl1

#/Users/abdelrahman/gain/android_trial/infer-out/captured/Generated.java.c2d454e71bd0f2dce82ac9236fb05996
cl2: 
	$(INFERANALYZE) -cluster xcl2.cluster >cl2

#/Users/abdelrahman/gain/android_trial/infer-out/captured/MainActivity.java.a23d1cdba544f37f6ccc930bda45fe5f
cl3: 
	$(INFERANALYZE) -cluster xcl3.cluster >cl3

#/Users/abdelrahman/gain/android_trial/infer-out/captured/MainActivity.java.ac2aacfebbde13ecd1fd5713040e57c5
cl4: 
	$(INFERANALYZE) -cluster xcl4.cluster >cl4

#/Users/abdelrahman/gain/android_trial/infer-out/captured/R.java.113a05b5e22f8efaacbb26effcdc42dd
cl5: 
	$(INFERANALYZE) -cluster xcl5.cluster >cl5

#/Users/abdelrahman/gain/android_trial/infer-out/captured/R.java.99ffd166a8154b5ba690dc0366a08c9b
cl6: 
	$(INFERANALYZE) -cluster xcl6.cluster >cl6


clean:
	rm -f $(CLUSTERS)
