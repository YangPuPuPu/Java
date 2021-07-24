// /*
//     * ���򷽷���
//     * ��ע�⣬���й����� sort��������������ͬ����ʽ��
//     * ��Ҫʱִ�в�����飬Ȼ�󽫲�����չΪ����package-private�����ڲ���ʵ�ַ�������Ĳ�����legacyMergeSort���⣩�ࣩ
//     */
//
//    /*
//     * ��ָ�������鰴�������С�
//     * <p>ʵʩ˵����
//     * �����㷨��Vladimir Yaroslavskiy��Jon Bentley��Joshua Bloch��д��˫�����������
//     * ���㷨��������ݼ����ṩO��n log��n�������ܣ��Ӷ����������������򽵼�Ϊ�������ܣ�����ͨ���ȴ�ͳ�����ᣩQuicksortʵ�ָ��졣
//     * @param a һ��Ҫ���������
//     */
//    public static void sort(int[] a) {
//        DualPivotQuicksort.sort(a, 0, a.length - 1, null, 0, 0);
//    }
//
// /**
//     * ������ܵĻ���ʹ�ø����Ĺ�����������Ƭ�������ָ����Χ��������
//     * @param a Ҫ���������
//     * @param left Ҫ����ĵ�һ��Ԫ�ص�����������
//     * @param right Ҫ��������һ��Ԫ�ص�����������
//     * @param work ���������飨��Ƭ��
//     * @param work ���������п��ÿռ����Դ
//     * @param workLen ��������Ŀ��ô�С
//     */
//    static void sort(int[] a, int left, int right,
//                     int[] work, int workBase, int workLen) {
//        // ��С��������ʹ�ÿ�������
//        // QUICKSORT_THRESHOLD:  ���Ҫ���������ĳ���С�ڴ˳�������������������ںϲ�����(Ĭ��ֵ: 286)
//        if (right - left < QUICKSORT_THRESHOLD) {
//            sort(a, left, right, true);
//            return;
//        }
//
//        /*
//         * ���� run[i] �ǵ�i�����еĿ�ʼ��������򣩡�
//         * MAX_RUN_COUNT: �ϲ������е�������д���(Ĭ��ֵ: 67)
//         */
//        int[] run = new int[MAX_RUN_COUNT + 1];
//        int count = 0; run[0] = left;
//
//        // ��������Ƿ�ӽ�����
//        for (int k = left; k < right; run[count] = k) {
//            if (a[k] < a[k + 1]) { // ����
//                while (++k <= right && a[k - 1] <= a[k]);
//            } else if (a[k] > a[k + 1]) { // ����
//                while (++k <= right && a[k - 1] >= a[k]);
//                for (int lo = run[count] - 1, hi = k; ++lo < --hi; ) {
//                    int t = a[lo]; a[lo] = a[hi]; a[hi] = t;
//                }
//            } else { // ����
//                // MAX_RUN_LENGTH: �ϲ����������е���󳤶�(Ĭ��ֵ: 33)
//                for (int m = MAX_RUN_LENGTH; ++k <= right && a[k - 1] == a[k]; ) {
//                    if (--m == 0) {
//                        sort(a, left, right, true);
//                        return;
//                    }
//                }
//            }
//
//            /*
//             * ���鲻�Ǹ߶Ƚṹ������ʹ�ÿ�����������Ǻϲ�����
//             */
//            if (++count == MAX_RUN_COUNT) {
//                sort(a, left, right, true);
//                return;
//            }
//        }
//// Check special cases
//        // Implementation note: variable "right" is increased by 1.
//        if (run[count] == right++) { // The last run contains one element
//            run[++count] = right;
//        } else if (count == 1) { // The array is already sorted
//            return;
//        }
// 
//        // Determine alternation base for merge
//        byte odd = 0;
//        for (int n = 1; (n <<= 1) < count; odd ^= 1);
// 
//        // Use or create temporary array b for merging
//        int[] b;                 // temp array; alternates with a
//        int ao, bo;              // array offsets from 'left'
//        int blen = right - left; // space needed for b
//        if (work == null || workLen < blen || workBase + blen > work.length) {
//            work = new int[blen];
//            workBase = 0;
//        }
//        if (odd == 0) {
//            System.arraycopy(a, left, work, workBase, blen);
//            b = a;
//            bo = 0;
//            a = work;
//            ao = workBase - left;
//        } else {
//            b = work;
//            ao = 0;
//            bo = workBase - left;
//        }
// 
//        // Merging
//        for (int last; count > 1; count = last) {
//            for (int k = (last = 0) + 2; k <= count; k += 2) {
//                int hi = run[k], mi = run[k - 1];
//                for (int i = run[k - 2], p = i, q = mi; i < hi; ++i) {
//                    if (q >= hi || p < mi && a[p + ao] <= a[q + ao]) {
//                        b[i + bo] = a[p++ + ao];
//                    } else {
//                        b[i + bo] = a[q++ + ao];
//                    }
//                }
//                run[++last] = hi;
//            }
//            if ((count & 1) != 0) {
//                for (int i = right, lo = run[count - 1]; --i >= lo;
//                    b[i + bo] = a[i + ao]
//                );
//                run[++last] = right;
//            }
//            int[] t = a; a = b; b = t;
//            int o = ao; ao = bo; bo = o;
//        }
//    }
//
//    }
//
// /**
//     * ͨ��Dual-Pivot Quicksort��ָ����Χ�������������
//     *
//     * @param a Ҫ���������
//     * @param left Ҫ����ĵ�һ��Ԫ�ص�����������
//     * @param right Ҫ��������һ��Ԫ�ص�����������
//     * @param leftmost ָʾ�˲����Ƿ��ڷ�Χ�������
//     */
//    private static void sort(int[] a, int left, int right, boolean leftmost) {
//        int length = right - left + 1;
//
//        // ��С��������ʹ�ò�������
//        // INSERTION_SORT_THRESHOLD: ���Ҫ���������ĳ���С�ڴ˳������������������ڿ�������ʹ�á�
//        if (length < INSERTION_SORT_THRESHOLD) {//46
//            // Ϊ�˷���鿴,�Ұ��ⲿ�ֵ������˳���,�ɵ���������в鿴
//            return;
//        }
//
//        // �õ��ܳ��ȵ��߷�֮һ
//        int seventh = (length >> 3) + (length >> 6) + 1;
//
//        /*
//         * �ڷ�Χ�ڵ�����Ԫ����Χ��������Χ��������Ⱦ�Ԫ�ؽ�������
//         * ��ЩԪ�ؽ���������ѡ������������
//         * ���ݾ���ȷ����ЩԪ�صļ��ѡ������ڸ��������Ϻܺõع�����
//         */
//        int e3 = (left + right) >>> 1; // �е�, 4/7
//        int e2 = e3 - seventh; // 3/7
//        int e1 = e2 - seventh; // 2/7
//        int e4 = e3 + seventh; // 5/7
//        int e5 = e4 + seventh; // 6/7
//
//        // ʹ�ò�����������Ԫ��(����)��������
//        //ʹ֮˳��Ϊa[e1]<a[e2]<a[e3]<a[e4]<a[e5]
//        // �ڶ�����С�ڵ�һ�����򽻻�
//        if (a[e2] < a[e1]) { int t = a[e2]; a[e2] = a[e1]; a[e1] = t; }
//		// ��������С�ڵڶ������򽻻�
//        if (a[e3] < a[e2]) { int t = a[e3]; a[e3] = a[e2]; a[e2] = t;
//            // 3����2֮�����ж��Ƿ�С��1,���С��1���������
//            if (t < a[e1]) { a[e2] = a[e1]; a[e1] = t; }
//        }
//        // ͬ��
//        if (a[e4] < a[e3]) { int t = a[e4]; a[e4] = a[e3]; a[e3] = t;
//            if (t < a[e2]) { a[e3] = a[e2]; a[e2] = t;
//                if (t < a[e1]) { a[e2] = a[e1]; a[e1] = t; }
//            }
//        }
//        // ͬ��
//        if (a[e5] < a[e4]) { int t = a[e5]; a[e5] = a[e4]; a[e4] = t;
//            if (t < a[e3]) { a[e4] = a[e3]; a[e3] = t;
//                if (t < a[e2]) { a[e3] = a[e2]; a[e2] = t;
//                    if (t < a[e1]) { a[e2] = a[e1]; a[e1] = t; }
//                }
//            }
//        }
//
//        // ָ��
//        int less  = left;
//        int great = right;
//		// �ж����Ԫ���Ƿ񶼲�һ��
//        if (a[e1] != a[e2] && a[e2] != a[e3] && a[e3] != a[e4] && a[e4] != a[e5]) {
//            /*
//             * ʹ���������Ԫ���еĵڶ����͵��ĸ���Ϊ���ġ�
//             * ��Щֵ�����еĵ�һ�͵ڶ��Եı��˵Ľ���ֵ��
//             * ��ע�� pivot1 <= pivot2��
//             */
//            int pivot1 = a[e2];//ȷ���������ֵ
//            int pivot2 = a[e4];
//
//            /*
//             * ��Ҫ����ĵ�һ�������һ��Ԫ���ƶ�����ǰ������ռ�ݵ�λ�á�
//             * ������ɺ����Ὣ������������λ�ã����Ӻ����������ų���
//             */
//            a[e2] = a[left];
//            a[e4] = a[right];
//
//            /*
//             * ����Ԫ��, С�ڻ��������ֵ��
//             */
//            while (a[++less] < pivot1);//��a[less]����prvot1ʱ����ֹͣ
//            while (a[--great] > pivot2);//��a[great]С��prvot2ʱ����ֹͣ
//
//            /*
//             * ����:
//             *
//             *   left part           center part                   right part
//             * +--------------------------------------------------------------+
//             * |  < pivot1  |  pivot1 <= && <= pivot2  |    ?    |  > pivot2  |
//             * +--------------------------------------------------------------+
//             *               ^                          ^       ^
//             *               |                          |       |
//             *              less                        k     great
//             *
//             * Invariants:
//             *
//             *              all in (left, less)   < pivot1
//             *    pivot1 <= all in [less, k)     <= pivot2
//             *              all in (great, right) > pivot2
//             *
//             * ָ�� k �� ?��part �ĵ�һ������.
//             */
//
//            /*
//             * Partitioning:
//             *
//             *   left part         center part                  right part
//             * +----------------------------------------------------------+
//             * | == pivot1 |  pivot1 < && < pivot2  |    ?    | == pivot2 |
//             * +----------------------------------------------------------+
//             *              ^                        ^       ^
//             *              |                        |       |
//             *             less                      k     great
//             *
//             * Invariants:
//             *
//             *              all in (*,  less) == pivot1
//             *     pivot1 < all in [less,  k)  < pivot2
//             *              all in (great, *) == pivot2
//             *
//             * Pointer k is the first index of ?-part.
//             */
//            outer:
//            for (int k = less - 1; ++k <= great; ) {//ȷ��pivot1��pivot2��λ��
//                int ak = a[k];//�м����ak�����洢a[k]��ֵ�����ڽ���
//                if (ak < pivot1) { // �ƶ� a[k] �����
//                    a[k] = a[less];
//                    a[less] = ak;
//                    ++less;
//                } else if (ak > pivot2) { // �ƶ� a[k] ���ұ�
//                    // ��ȡ�ұߵ�һλС��pivot2��Ԫ������
//                    while (a[great] > pivot2) {//Ѱ��һ��С��piovt2��ֵ
//                        if (great-- == k) { // ����������ѭ��(��ʾû��Ԫ��)
//                            break outer;
//                        }
//                    }
//                    if (a[great] < pivot1) { // a[great] <= pivot2���ҵ��ұ�С��pivot1��ֵ�����������
//                        a[k] = a[less];
//                        a[less] = a[great];//С��pivot1�ͽ�����a[less]
//                        ++less;
//                    } else { // pivot1 <= a[great] <= pivot2
//                        a[k] = a[great];//a[great]�պþ���p1��p2֮�䣬����ֱ�Ӹ�ֵ
//                    }
//                    /*
//                     *  ��Ϊak����pivot2�������ұ�
//                     */
//                    a[great] = ak;
//                    --great;
//                }
//            }
//
//            // �������ᵽ����λ��
//            a[left]  = a[less  - 1]; a[less  - 1] = pivot1;//less-1
//            a[right] = a[great + 1]; a[great + 1] = pivot2;//great+1
//
//            // �ݹ��������Ҳ��֣���������֪����
//            sort(a, left, less - 2, leftmost);
//            sort(a, great + 2, right, false);
//            /*
//             * ������Ĳ���̫��(���ڵ���������߷�֮��)�����ڲ�����ֵ(pivot1��pivot2)������ĩ�ˡ�
//             */
//            if (less < e1 && e5 < great) {// 6/7-2/7
//                /*
//                 * ������������ֵ(pivot1��pivot2)��Ԫ�ء�
//                 */
//                while (a[less] == pivot1) {
//                    ++less;
//                }
//
//                while (a[great] == pivot2) {
//                    --great;
//                }
//                outer://���м����pivot1��pivot2��ֵ�ƶ�����������
//                for (int k = less - 1; ++k <= great; ) {//��less��ʼ������great
//                    int ak = a[k];//����һ���м����洢a[k]��ֵ
//                    if (ak == pivot1) { // ak����pivot1ʱ������a[less]��a[k]��ֵ������less++
//                        a[k] = a[less];
//                        a[less] = ak;
//                        ++less;
//                    } else if (ak == pivot2) { //ak����pivot2ʱ
//                    	
//                        while (a[great] == pivot2) {//���Ҷ˿�ʼ������������pivot2��ֵ
//                            if (great-- == k) {//������k��û��Ԫ�ص�ʱ�������
//                                break outer;
//                            }
//                        }
//                        
//                        if (a[great] == pivot1) { // �ж�a[great]�ǲ��ǵ���pivot1
//                            a[k] = a[less];
//                            /*
//                             * ���a[great]����pivot1
//                             * ���Ƚ���a[k]��a[great]��ֵ
//                             * ����less++
//                             */
//                            a[less] = pivot1;
//                            ++less;
//                        } else { // pivot1 < a[great] < pivot2(������pivot1)
//                        	//�ͽ���a[k]��a[great];
//                            a[k] = a[great];
//                        }
//                        a[great] = ak;//��Ϊ��ak=pivot2����a[k]Ҫ�������Ҷ˼��±�Ϊgreat
//                        --great;
//                    }
//                }
//            }
//            // �ݹ��������Ĳ���
//            sort(a, less, great, false);
//
//        } else { //�����Ԫ�������������������������ʱ
//             	 //��һ��������з���(��ΪС��p����p�ʹ���p)
//             	 //ʹ���������Ԫ���еĵ�������Ϊ���ᡣe3(4/7)
//            int pivot = a[e3];
//            for (int k = less; k <= great; ++k) {//k��less��ʼ��great����
//                if (a[k] == pivot) {//�����Ⱦ�����
//                    continue;
//                }
//                int ak = a[k];
//                if (ak < pivot) { //���ak��pivotС�Ļ����ͷ������
//                    a[k] = a[less];
//                    a[less] = ak;
//                    ++less;
//                } else { // a[k] > pivot ���ak����pivot�Ļ�
//                    while (a[great] > pivot) {//great��������ɨ��ֱ��ɨ�赽һ��С�ڵ�������p��ֵ
//                        --great;
//                    }
//                    if (a[great] < pivot) { // a[great] <= pivot ��С��p��ֵ
//                        a[k] = a[less];//��less��ֵ����a[k]
//                        a[less] = a[great];//��С��p��a[great]�ŵ����a[less];
//                        ++less;
//                    } else { // a[great] == pivot ���ڵ�ʱ��ͽ���a[great]��a[k];
//                        a[k] = pivot;
//                    }
//                    a[great] = ak;//��Ϊak����p��Ӧ��ֵ������Ҫ��ak�ŵ��Ҷˣ���ֵ��a[great]
//                    --great;
//                }
//            }
//             //�ݹ��������Ҳ��֡�
//             //���Ĳ��ֵ�����Ԫ�ؾ���ȣ�����Ѿ�����
//            sort(a, left, less - 1, leftmost);
//            sort(a, great + 1, right, false);
//        }
//    }
//
//    /*
//     * �����˻�Ϊ��ͳ��3�򣨻򡰺������족���ܹ�
//     *
//     *   left part    center part              right part
//     * +-------------------------------------------------+
//     * |  < pivot  |   == pivot   |     ?    |  > pivot  |
//     * +-------------------------------------------------+
//     *              ^              ^        ^
//     *              |              |        |
//     *             less            k      great
//     *
//     * Invariants:
//     *
//     *   all in (left, less)   < pivot
//     *   all in [less, k)     == pivot
//     *   all in (great, right) > pivot
//     *
//     * Pointer k is the first index of ?-part.
//     */
//
//private static void sort(int[] a, int left, int right, boolean leftmost) {
//	if (leftmost) {
//        /*
//         * ��ͳ����ǰ�ڣ��������ͣ�
//         * ��Է�����VM�������Ż�,
//         * ��������ߵĲ���.
//         */
//        for (int i = left, j = i; i < right; j = ++i) {
//            int ai = a[i + 1];	// �õ���һλԪ�ص�ֵ
//            /*
//             * �ж�ai�Ƿ�С��ǰ���Ԫ��ֵ
//             * ���С����ǰ���ֵ����һλ
//             * һֱ��ǰ������������λ����ǰ��Ԫ��ֵС�ڵ���aiΪֹ
//             */
//            while (ai < a[j]) {
//                a[j + 1] = a[j];
//                if (j-- == left) {
//                    break;
//                }
//            }
//            // ��������������ֵ��Ϊai,��ɽ���
//            a[j + 1] = ai;
//        }
//    } else {
//        /*
//         * �����������.
//         */
//        do {
//            if (left >= right) {
//                return;
//            }
//        } while (a[++left] >= a[left - 1]);
//
//        /*
//         * ���ڲ��ֵ�ÿ��Ԫ�ض��������ڱ��Ľ�ɫ��
//         * ��ˣ���ʹ���Ǳ�����ÿ�ε�������Χ��顣
//         * ���⣬����ʹ�ø��Ż����㷨
//         * ��ν����Բ�������
//         * ����Quicksort�ı����£���ȴ�ͳ�Ĳ�������ʵ��Ҫ�졣
//         */
//        for (int k = left; ++left <= right; k = ++left) {
//            long a1 = a[k], a2 = a[left];
//
//            if (a1 < a2) {
//                a2 = a1; a1 = a[left];
//            }
//            while (a1 < a[--k]) {
//                a[k + 2] = a[k];
//            }
//            a[++k + 1] = a1;
//
//            while (a2 < a[--k]) {
//                a[k + 1] = a[k];
//            }
//            a[k + 1] = a2;
//        }
//        long last = a[right];
//
//        while (last < a[--right]) {
//            a[right + 1] = a[right];
//        }
//        a[right + 1] = last;
//    }
//}