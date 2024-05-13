<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath }" />    

<c:set var="lookbookAllList" value="${lookbookMap.lookbookList }" />

<c:set var="lookbookListBrand" value="${lookbookMap.lookbookListBrand }" />

<link rel="stylesheet" href="/finalpro/resources/css/magazineList.css">

<!-- 페이지 순서 만들때는 이거 사용하면 됨 -->

<script>

var currentPage = 1;
var itemsPerPage = 9;	


function goToPage(pageNum) {
    currentPage = pageNum;
    updateItemsDisplay();
}

function nextPage() {
    var allItems = document.querySelectorAll('.lookbookInfo');
    var totalPages = Math.ceil(allItems.length / itemsPerPage);
    if (currentPage < totalPages) {
        currentPage++;
        updateItemsDisplay();
    }
}

function previousPage() {
    if (currentPage > 1) {
        currentPage--;
        updateItemsDisplay();
    }
}

document.addEventListener('DOMContentLoaded', function() {
    updateItemsDisplay();
});
</script>

<script>

//페이지네이션 버튼을 동적으로 생성하는 함수
function createPaginationButtons() {
    var paginationContainer = document.querySelector('.paginationLookbook');
    var totalItems = document.querySelectorAll('.lookbookInfo').length;
    var totalPages = Math.ceil(totalItems / itemsPerPage);

    // 기존 페이지네이션 버튼을 모두 제거합니다.
    paginationContainer.innerHTML = '';

 // 맨 처음 페이지로 이동하는 버튼 추가
    if (currentPage > 1) {
        let firstPageButton = document.createElement('button');
        firstPageButton.className = 'pagination_button';
        firstPageButton.innerText = '<<';
        firstPageButton.addEventListener('click', firstPage);
        paginationContainer.appendChild(firstPageButton);
    }

    if (currentPage > 1) {
        let prevButton = document.createElement('button');
        prevButton.className = 'pagination_button';
        prevButton.innerText = '<';
        prevButton.addEventListener('click', previousPage);
        paginationContainer.appendChild(prevButton);
    }

    for (let i = 1; i <= totalPages; i++) {
        let button = document.createElement('button');
        button.className = 'pagination_button';
        button.innerText = i;
        if (i === currentPage) {
            button.classList.add('active');
        }
        button.addEventListener('click', function() {
            goToPage(i);
        });
        paginationContainer.appendChild(button);
    }

    if (currentPage < totalPages) {
        let nextButton = document.createElement('button');
        nextButton.className = 'pagination_button';
        nextButton.innerText = '>';
        nextButton.addEventListener('click', nextPage);
        paginationContainer.appendChild(nextButton);
    }

    // 맨 끝 페이지로 이동하는 버튼 추가
    if (currentPage < totalPages) {
        let lastPageButton = document.createElement('button');
        lastPageButton.className = 'pagination_button';
        lastPageButton.innerText = '>>';
        lastPageButton.addEventListener('click', function() {
            lastPage(totalPages);
        });
        paginationContainer.appendChild(lastPageButton);
    }
}

function firstPage() {
    currentPage = 1;
    updateItemsDisplay();
}

function lastPage(totalPages) {
    currentPage = totalPages;
    updateItemsDisplay();
}




document.addEventListener('DOMContentLoaded', function() {
    updateItemsDisplay(); // 아이템을 업데이트하는 함수
    createPaginationButtons(); // 페이지네이션 버튼을 생성하는 함수
});



function updateItemsDisplay() {
    var allItems = document.querySelectorAll('.lookbookInfo');
    var startItem = (currentPage - 1) * itemsPerPage;
    var endItem = startItem + itemsPerPage;

    allItems.forEach(function(item, index) {
        if (index >= startItem && index < endItem) {
            item.style.display = 'block'; // 현재 페이지 아이템만 보여주기
        } else {
            item.style.display = 'none'; // 다른 페이지 아이템 숨기기
        }
    });

    createPaginationButtons(); // 페이지네이션 버튼 업데이트
}

</script>




<!-- 브랜드 가 들어왔을 때 페이지 -->
<script>

function goToPage2(pageNum) {
    currentPage = pageNum;
    updateItemsDisplay2();
}

function nextPage2() {
    var allItems = document.querySelectorAll('.lookbookInfo');
    var totalPages = Math.ceil(allItems.length / itemsPerPage);
    if (currentPage < totalPages) {
        currentPage++;
        updateItemsDisplay2();
    }
}

function previousPag2e() {
    if (currentPage > 1) {
        currentPage--;
        updateItemsDisplay2();
    }
}

document.addEventListener('DOMContentLoaded', function() {
    updateItemsDisplay2();
});
</script>

<script>

//페이지네이션 버튼을 동적으로 생성하는 함수
function createPaginationButtons2() {
    var paginationContainer = document.querySelector('.paginationLookbook2');
    var totalItems = document.querySelectorAll('.lookbookInfo').length;
    var totalPages = Math.ceil(totalItems / itemsPerPage);

    // 기존 페이지네이션 버튼을 모두 제거합니다.
    paginationContainer.innerHTML = '';

 // 맨 처음 페이지로 이동하는 버튼 추가
    if (currentPage > 1) {
        let firstPageButton = document.createElement('button');
        firstPageButton.className = 'pagination_button';
        firstPageButton.innerText = '<<';
        firstPageButton.addEventListener('click', firstPage);
        paginationContainer.appendChild(firstPageButton);
    }

    if (currentPage > 1) {
        let prevButton = document.createElement('button');
        prevButton.className = 'pagination_button';
        prevButton.innerText = '<';
        prevButton.addEventListener('click', previousPage);
        paginationContainer.appendChild(prevButton);
    }

    for (let i = 1; i <= totalPages; i++) {
        let button = document.createElement('button');
        button.className = 'pagination_button';
        button.innerText = i;
        if (i === currentPage) {
            button.classList.add('active');
        }
        button.addEventListener('click', function() {
            goToPage(i);
        });
        paginationContainer.appendChild(button);
    }

    if (currentPage < totalPages) {
        let nextButton = document.createElement('button');
        nextButton.className = 'pagination_button';
        nextButton.innerText = '>';
        nextButton.addEventListener('click', nextPage);
        paginationContainer.appendChild(nextButton);
    }

    // 맨 끝 페이지로 이동하는 버튼 추가
    if (currentPage < totalPages) {
        let lastPageButton = document.createElement('button');
        lastPageButton.className = 'pagination_button';
        lastPageButton.innerText = '>>';
        lastPageButton.addEventListener('click', function() {
            lastPage2(totalPages);
        });
        paginationContainer.appendChild(lastPageButton);
    }
}

function firstPage2() {
    currentPage = 1;
    updateItemsDisplay();
}

function lastPage2(totalPages) {
    currentPage = totalPages;
    updateItemsDisplay();
}




document.addEventListener('DOMContentLoaded', function() {
    updateItemsDisplay2(); // 아이템을 업데이트하는 함수
    createPaginationButtons2(); // 페이지네이션 버튼을 생성하는 함수
});



function updateItemsDisplay2() {
    var allItems = document.querySelectorAll('.lookbookInfo');
    var startItem = (currentPage - 1) * itemsPerPage;
    var endItem = startItem + itemsPerPage;

    allItems.forEach(function(item, index) {
        if (index >= startItem && index < endItem) {
            item.style.display = 'block'; // 현재 페이지 아이템만 보여주기
        } else {
            item.style.display = 'none'; // 다른 페이지 아이템 숨기기
        }
    });

    createPaginationButtons2(); // 페이지네이션 버튼 업데이트
}

</script>



<body>

	<c:if test="${not empty lookbookAllList}">
		<div class="magazine_path">
			<h1>Magazine</h1><p> > Lookbook</p> <span>다양한 브랜드의 컬렉션을 집중 소개하며 합리적인 쇼핑에 도움을 줄 유용한 가이드를 담은 콘텐츠를 제공합니다.</span>
		</div>
		
		<div class="lookbookWrap">
			<!-- 페이지 버튼 -->	  
		 	<div class="paginationLookbook"></div>
			
			
			
			<div class="lookbookGrid">
				<c:forEach var="lal" items="${lookbookAllList}" varStatus="status">
					    <div class="lookbookInfo" id="lal${status.index + 1}">
					        <a href="${contextPath }/magazine/lookbookInfo.do?magazineNo=${lal.magazineNo}">
					            <img src="${contextPath}/download.do?imageFileName=1.jpg&magazineNo=${lal.magazineNo}&path=lookbook" id="preview${status.index + 1}">
					            <h3>룩북 | ${lal.title }</h3>
					            <p>${lal.brand}</p>
					            <p>${lal.subTitle}</p>
					        </a>
					    </div>
				</c:forEach	>
			</div>
		
		</div>
	</c:if>	
	
	
	<c:if test="${not empty lookbookListBrand}">
		<div class="magazine_path">
			<h1>Magazine</h1><p> > Lookbook</p> <span>다양한 브랜드의 컬렉션을 집중 소개하며 합리적인 쇼핑에 도움을 줄 유용한 가이드를 담은 콘텐츠를 제공합니다.</span>
		</div>
		
		<div class="lookbookWrap">
			<!-- 페이지 버튼 -->	  
		 	<div class="paginationLookbook2"></div>
			
			
			
			<div class="lookbookGrid">
				<c:forEach var="lalB" items="${lookbookListBrand}" varStatus="status">
					    <div class="lookbookInfo" id="lalB${status.index + 1}">
					        <a href="${contextPath }/magazine/lookbookInfo.do?magazineNo=${lalB.magazineNo}">
					            <img src="${contextPath}/download.do?imageFileName=1.jpg&magazineNo=${lalB.magazineNo}&path=lookbook" id="preview${status.index + 1}">
					            <h3>룩북 | ${lalB.title }</h3>
					            <p>${lalB.brand}</p>
					            <p>${lalB.subTitle}</p>
					        </a>
					    </div>
				</c:forEach	>
			</div>
		
		</div>
	</c:if>
	
	
	
	
	
		
</body>
