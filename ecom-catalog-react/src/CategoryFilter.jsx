const CategoryFilter = ({ categories, onSelect }) => {
    return (
        <>
            <select className="form-control" id="categorySelect" onChange={(e) => onSelect(e.target.value)}>
                <option value="">All categories</option>
                {categories.map((category) => (
                    <option key={category.id} value={category.id}>{category.name}</option>
                ))}
            </select>
        </>
    )
}

export default CategoryFilter;