
public class Questao1 {
	
	public static void main(String[] args) {
		
		OptimizedDiskCache optimizedDiskCache = new OptimizedDiskCache();
		Cache cache = (Cache) optimizedDiskCache;
		
		System.out.println("1 = " + cache);

//		MemoryCache memoryCache = new MemoryCache();
//		Cache cache1 = (Cache) memoryCache;
//		DiskCache diskCache = (DiskCache) cache1;
		
//		System.out.println("2 = " + diskCache);

//		DiskCache diskCache1 = new DiskCache();
//		OptimizedDiskCache optimizedDiskCache1 = (OptimizedDiskCache) diskCache1;
//		
//		System.out.println("3 = " + optimizedDiskCache1);

		OptimizedDiskCache optimizedDiskCache2 = new OptimizedDiskCache();
		DiskCache diskCache2 = (DiskCache) optimizedDiskCache2;
		
		
		System.out.println("4 = " + diskCache2);

//		Cache cache2 = new Cache();
//		MemoryCache memoryCache1 = (MemoryCache) cache2;
//		
//		System.out.println("5 = " + memoryCache1);

		OptimizedDiskCache optimizedDiskCache3 = new OptimizedDiskCache();
		Cache cache3 = (Cache) optimizedDiskCache3;
		DiskCache diskCache3 = (DiskCache) cache3;
		
		System.out.println("6 = " + diskCache3);
		
		
	}

}

class Cache {}

class DiskCache extends Cache {}

class MemoryCache extends Cache {}

class OptimizedDiskCache extends DiskCache {}
