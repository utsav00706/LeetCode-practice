class Solution:
    def maxArea(self, height: List[int]) -> int:
        l=len(height)-1
        r=0
        ar=0
        while(l>r):
            ar=max(ar,min(height[l],height[r])*(l-r))
            if(height[l]>height[r]):
                r=r+1
            else:
                l=l-1
        return ar