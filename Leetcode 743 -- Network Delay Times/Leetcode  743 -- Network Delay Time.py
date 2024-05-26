//Leetcode 743: Network Delay Time
//https://leetcode.com/problems/network-delay-time/
class Solution(object):
    def networkDelayTime(self, times, n, k):
        """
        :type times: List[List[int]]
        :type n: int
        :type k: int
        :rtype: int
        """
        # Dikjstra's Algorithm using MinHeap + stack
        edges = collections.defaultdict(list)  
        for u, v, w in times:
            edges[u].append((v, w)) 
        #use a dictionary to implement an adjancy list for all the "edges"
        
        #initilize this minheap
        minHeap = [(0, k)] #min heap that stores the dist/path to the node k
        visit = set() #keep a set of all the nodes that we have visited before
        t = 0 #time to store the time it took to visit there

        while minHeap: #visit every part of the minHeap (go through all the nodes)
            w1, n1 = heapq.heappop(minHeap) #take out the first node in the Heap
            if n1 in visit: #don't want to visit multiple times, so if visited before just get out to next iteration
                continue
            visit.add(n1) #add it to visit so no visit again
            t = max(t, w1) #add the weight of the node (the time in this situation)

            for n2, w2 in edges[n1]: #go through all the neighbors and its the nodes
                if n2 not in visit: #check if visited it before, if its not
                    heapq.heappush(minHeap, (w1 + w2, n2)) #add the distance to the heap
        
        return t if len(visit) == n else -1 #return the time to visit all the nodes for every node

    #time Complexity: O(E * logV) where E = Edges and V = Nodes
    #space Complexity: O(N) 