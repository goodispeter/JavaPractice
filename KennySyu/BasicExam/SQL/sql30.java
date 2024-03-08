package SQL;

public class sql30 {
//    -- 1. 顯示每一位員工的職務是XXXX並給予一個名稱Jobs
//    select * FROM EMP;
//
//    select CAST(EMPNO as nvarchar) + '   ' +ENAME EMP,'IS '+JOB JOB
//    FROM EMP;
//
//    SELECT CAST(EMPNO AS NVARCHAR)+' '+ENAME EMP, ' IS '+JOB JOB
//    FROM EMP;
//
//--2. 列出各部門中現有的職務分類--
//    SELECT DISTINCT DEPTNO, JOB
//    FROM EMP
//    GO
//--3. 列出下表--
//    SELECT DEPTNO [編號] ,ENAME [姓名],JOB [職務] ,SAL [薪資]
//    from EMP
//    GO
//
//--4. 列出姓名中含有M與A字母的員工--
//    SELECT *
//    FROM EMP
//    WHERE ENAME LIKE '%A%'  AND ENAME LIKE '%M%'
//    GO
//
//
//--5. 列出職務為SALESMAN且COMM=0的員工--
//    SELECT *
//    FROM EMP
//    WHERE JOB = 'SALESMAN'
//    AND
//            COMM = 0
//    GO
//
//
//--6. 列出1981年到職的員工--
//
//    SELECT *
//    FROM EMP
//    WHERE HIREDATE LIKE  '%1981%';
//
//--also can do it ,use function--
//    SELECT *
//    FROM EMP
//    WHERE DATEPART(YEAR, HIREDATE) =  1981
//    ORDER BY EMPNO
//            GO
//
//
//--7. 依各職務類別及薪資降冪排序--
//    SELECT *
//    FROM EMP
//    ORDER BY JOB ,SAL DESC
//    GO
//
//--8. 顯示員工的資訊並依下列職務的順序排列--
// /*  PRESIDENT
//   MANAGER
//   ANALYST
//   CLERK
//   SALESMAN */
//
//    select EMPNO,ENAME ,JOB
//    FROM EMP
//    ORDER BY  case  JOB
//
//    WHEN 'PRESIDENT' THEN 1
//    WHEN 'MANAGER' THEN 2
//    WHEN 'ANALYST' THEN 3
//    WHEN 'CLERK' THEN 4
//    WHEN 'SALESMAN' THEN 5
//    ELSE 6
//    END;
//
//
//--9. 依據職務計算出員工調整後的薪資--
//
///*SALESMAN 調5%
//   MANAGER  調7%
//   PRESIDENT調10%
//   其餘的不變*/
//
//    SELECT EMPNO,ENAME,JOB,SAL,CASE JOB
//    WHEN 'SALESMAN' THEN SAL * 1.05
//    WHEN 'MANAGER'  THEN SAL * 1.07
//    WHEN 'PRESIDENT'THEN SAL * 1.1
//    ELSE SAL
//    END [NEW SAL]
//    FROM EMP
//    ORDER BY 'new SAL' DESC
//            GO
//
// --10 .列出部門=10,各員工的年資--
//
//    SELECT  EMPNO,ENAME,DATEDIFF (YEAR, HIREDATE,GETDATE()) [年資]
//    FROM EMP;
//--年資等於錄取日期檢調今天的日期--
//
//
//
//            --11.列出下面的結果--
//    SELECT EMPNO,ENAME,'*****$'+CAST(SAL as nvarchar)[ ],DEPTNO
//    FROM EMP
//    WHERE DEPTNO = 10
//    GO
//
//
//    select EMPNO,ENAME,HIREDATE,DATENAME(weekday, HIREDATE) [DAYNAME]
//    FROM EMP
//    ORDER BY CASE DATEPART(WEEKDAY, HIREDATE)
//    WHEN 1 THEN 8
//    ELSE DATEPART(WEEKDAY, HIREDATE)
//    END
//            GO
//
//
//--13.列出當月生日的員工--
//    SELECT EMPNO,ENAME,HIREDATE
//    FROM EMP
//    WHERE DATEPART(MONTH, HIREDATE) = DATEPART(MONTH, GETDATE()) +1
//    GO
//
//
//
//--14.計算各職務的人員人數及薪資總和--
//    SELECT JOB,COUNT(*)[CNT],SUM(SAL) [cost]
//    FROM EMP
//    GROUP BY JOB
//    ORDER BY 1;
//
//
//--15.計算各職務的平均薪資且>2000,依平均值排序列出--
//    SELECT JOB ,AVG(SAL) [AVGSAL]
//    FROM EMP
//    GROUP BY JOB
//    HAVING AVG(SAL) >2000
//    ORDER BY 2
//    GO
//
//
//--16.列出各年度僱用的人數,如下表--
//
//    SELECT
//    SUM(CASE WHEN DATEPART(YEAR, HIREDATE)=1980 THEN 1 ELSE 0 END ) [YY1980],
//    SUM(CASE WHEN DATEPART(YEAR, HIREDATE)=1981 THEN 1 ELSE 0 END ) [YY1980],
//    SUM(CASE WHEN DATEPART(YEAR, HIREDATE)=1982 THEN 1 ELSE 0 END ) [YY1980],
//    SUM(CASE WHEN DATEPART(YEAR, HIREDATE)=1983 THEN 1 ELSE 0 END ) [YY1980]
//    FROM EMP;
//
//
//--17.列出下表--
//    SELECT DISTINCT JOB,
//    SUM(CASE WHEN DEPTNO=10 THEN 1 ELSE 0 END) [DEPT10],
//    SUM(CASE WHEN DEPTNO=20 THEN 1 ELSE 0 END) [DEPT20],
//    SUM(CASE WHEN DEPTNO=30 THEN 1 ELSE 0 END) [DEPT30]
//    FROM EMP
//    GROUP BY JOB
//            GO
//
//
//--18.統計各級數的員工人數, 並依級數排序 人數--
//    SELECT a.TYPE,COUNT(a.TYPE) CNT
//    FROM (SELECT CASE
//                 WHEN SAL BETWEEN 0    AND 1200 THEN 'A'
//                         WHEN SAL BETWEEN 1201 AND 2000 THEN 'B'
//                         WHEN SAL BETWEEN 2001 AND 2800 THEN 'C'
//                         WHEN SAL BETWEEN 2801 AND 3500 THEN 'D'
//                         ELSE 'E'
//                         END TYPE
//                         FROM EMP ) A
//    GROUP BY type
//            GO
//
//    SELECT A.[LEVEL],COUNT(A.[LEVEL]) [CNT]
//    FROM (SELECT CASE
//     WHEN SAL BETWEEN 0 AND 1200 THEN 'A'
//             WHEN SAL BETWEEN 1201 AND 2000 THEN 'B'
//             WHEN SAL BETWEEN 2001 AND 2800 THEN 'C'
//             WHEN SAL BETWEEN 2801 AND 3500 THEN 'D'
//             ELSE 'E'
//             END LEVEL
//             FROM EMP) [A]
//    GROUP BY LEVEL
//            GO
//
//
//--19.列出各MANAGER中配置的員工人數--
//
//    select MGR ,COUNT(*) [cnt]
//    from EMP
//    GROUP BY MGR
//    ORDER BY MGR
//            GO
//
//    SELECT MGR, COUNT(*) CNT
//    FROM EMP
//    GROUP BY MGR;
//
// --20.列出各部門的人數--
//    SELECT DEPTNO,COUNT(*)
//    FROM EMP
//    GROUP BY DEPTNO;
}
